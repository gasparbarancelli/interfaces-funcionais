package doubleFunction;

import java.util.function.DoubleFunction;

public enum Colaboradores {

    DIRETOR(new CalculoComissaoDiretor()),
    ASSISTENTE_PROSPECCAO(new CalculoComissaoAssistenteProspeccao()),
    VENDEDOR(precoVenda -> precoVenda * 0.1),
    GERENTE(precoVenda -> precoVenda * 0.09);

    private final DoubleFunction<Double> calculoComissao;

    Colaboradores(DoubleFunction<Double> calculoComissao) {
        this.calculoComissao = calculoComissao;
    }

    public DoubleFunction<Double> getCalculoComissao() {
        return calculoComissao;
    }

}
