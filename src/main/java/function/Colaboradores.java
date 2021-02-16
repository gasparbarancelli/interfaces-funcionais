package function;

import java.util.function.Function;

public enum Colaboradores {

    ASSISTENTE_PROSPECCAO(precoVenda -> {
        if (precoVenda <= 100) {
            return 1D;
        }
        return precoVenda / 50;
    }),
    VENDEDOR(precoVenda -> precoVenda * 0.1),
    GERENTE(precoVenda -> precoVenda * 0.09),
    DIRETOR(precoVenda -> {
        if (precoVenda <= 100) {
            return 5D;
        } else if (precoVenda <= 1_000) {
            return precoVenda / 30;
        }
        return precoVenda / 25;
    });

    private final Function<Double, Double> calculoComissao;

    Colaboradores(Function<Double, Double> calculoComissao) {
        this.calculoComissao = calculoComissao;
    }

    public Function<Double, Double> getCalculoComissao() {
        return calculoComissao;
    }
}
