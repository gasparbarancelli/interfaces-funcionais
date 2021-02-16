package doubleFunctional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ColaboradoresTest {

    @Test
    void todosColaboradoresDevemGanharUmValorDeComissao() {
        double valorVenda = 1_895;
        for (Colaboradores colaborador : Colaboradores.values()) {
            Double valorComissao = colaborador.getCalculoComissao().apply(valorVenda);
            assertTrue(valorComissao > 0);
        }
    }

    @Test
    void valorComissaoAssistenteProspeccao() {
        Colaboradores assistenteProspeccao = Colaboradores.ASSISTENTE_PROSPECCAO;
        Double valorAssistenteProspeccao = assistenteProspeccao.getCalculoComissao().apply(100D);
        assertEquals(1, valorAssistenteProspeccao);

        valorAssistenteProspeccao = assistenteProspeccao.getCalculoComissao().apply(1_200D);
        assertEquals(24, valorAssistenteProspeccao);

        valorAssistenteProspeccao = assistenteProspeccao.getCalculoComissao().apply(12_345D);
        assertEquals(246.9, valorAssistenteProspeccao);
    }

    @Test
    void valorComissaoVendedor() {
        Colaboradores vendedor = Colaboradores.VENDEDOR;
        Double valorComissaoVendedor = vendedor.getCalculoComissao().apply(100D);
        assertEquals(10, valorComissaoVendedor);

        valorComissaoVendedor = vendedor.getCalculoComissao().apply(1_457.7);
        assertEquals(145.77, valorComissaoVendedor);
    }

    @Test
    void valorComissaoGerente() {
        Colaboradores gerente = Colaboradores.GERENTE;
        Double valorComissaoGerente = gerente.getCalculoComissao().apply(100D);
        assertEquals(9, valorComissaoGerente);

        valorComissaoGerente = gerente.getCalculoComissao().apply(13_000D);
        assertEquals(1170, valorComissaoGerente);
    }

    @Test
    void valorComissaoDiretor() {
        Colaboradores diretor = Colaboradores.DIRETOR;
        Double valorComissaoDiretor = diretor.getCalculoComissao().apply(100D);
        assertEquals(5, valorComissaoDiretor);

        valorComissaoDiretor = diretor.getCalculoComissao().apply(999D);
        assertEquals(33.3, valorComissaoDiretor);

        valorComissaoDiretor = diretor.getCalculoComissao().apply(5_729D);
        assertEquals(229.16, valorComissaoDiretor);
    }

}