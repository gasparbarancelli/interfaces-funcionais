package doubleFunction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DoubleFunctionDemoTest {

    @Test
    void todosColaboradoresDevemGanharUmValorDeComissao() {
        double valorVenda = 1_895;
        for (DoubleFunctionDemo colaborador : DoubleFunctionDemo.values()) {
            Double valorComissao = colaborador.getCalculoComissao().apply(valorVenda);
            assertTrue(valorComissao > 0);
        }
    }

    @Test
    void valorComissaoAssistenteProspeccao() {
        DoubleFunctionDemo assistenteProspeccao = DoubleFunctionDemo.ASSISTENTE_PROSPECCAO;
        Double valorAssistenteProspeccao = assistenteProspeccao.getCalculoComissao().apply(100D);
        assertEquals(1, valorAssistenteProspeccao);

        valorAssistenteProspeccao = assistenteProspeccao.getCalculoComissao().apply(1_200D);
        assertEquals(24, valorAssistenteProspeccao);

        valorAssistenteProspeccao = assistenteProspeccao.getCalculoComissao().apply(12_345D);
        assertEquals(246, valorAssistenteProspeccao);
    }

    @Test
    void valorComissaoVendedor() {
        DoubleFunctionDemo vendedor = DoubleFunctionDemo.VENDEDOR;
        Double valorComissaoVendedor = vendedor.getCalculoComissao().apply(100D);
        assertEquals(10, valorComissaoVendedor);

        valorComissaoVendedor = vendedor.getCalculoComissao().apply(1_457.7);
        assertEquals(145.77, valorComissaoVendedor);
    }

    @Test
    void valorComissaoGerente() {
        DoubleFunctionDemo gerente = DoubleFunctionDemo.GERENTE;
        Double valorComissaoGerente = gerente.getCalculoComissao().apply(100D);
        assertEquals(9, valorComissaoGerente);

        valorComissaoGerente = gerente.getCalculoComissao().apply(13_000D);
        assertEquals(1170, valorComissaoGerente);
    }

    @Test
    void valorComissaoDiretor() {
        DoubleFunctionDemo diretor = DoubleFunctionDemo.DIRETOR;
        Double valorComissaoDiretor = diretor.getCalculoComissao().apply(100D);
        assertEquals(5, valorComissaoDiretor);

        valorComissaoDiretor = diretor.getCalculoComissao().apply(999D);
        assertEquals(33, valorComissaoDiretor);

        valorComissaoDiretor = diretor.getCalculoComissao().apply(5_729D);
        assertEquals(229, valorComissaoDiretor);
    }

}