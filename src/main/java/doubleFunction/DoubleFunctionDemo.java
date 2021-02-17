package doubleFunction;

import java.util.List;
import java.util.function.DoubleFunction;

public enum DoubleFunctionDemo {

    DIRETOR(new CalculoComissaoDiretor()),
    ASSISTENTE_PROSPECCAO(new CalculoComissaoAssistenteProspeccao()),
    VENDEDOR(precoVenda -> precoVenda * 0.1),
    GERENTE(precoVenda -> precoVenda * 0.09);

    private final DoubleFunction<Double> calculoComissao;

    DoubleFunctionDemo(DoubleFunction<Double> calculoComissao) {
        this.calculoComissao = calculoComissao;
    }

    public DoubleFunction<Double> getCalculoComissao() {
        return calculoComissao;
    }

    public static void main(String[] args) {
        List.of(1_000, 2_340, 7_314, 9_119).stream()
                .map(it -> it * 0.1)
                .forEach(System.out::println);
    }

}
