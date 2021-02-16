package doubleFunctional;

import java.util.function.DoubleFunction;

public class CalculoComissaoDiretor implements DoubleFunction<Double> {
    @Override
    public Double apply(double precoVenda) {
        if (precoVenda <= 100) {
            return 5D;
        } else if (precoVenda <= 1_000) {
            return precoVenda / 30;
        }
        return precoVenda / 25;
    }
}
