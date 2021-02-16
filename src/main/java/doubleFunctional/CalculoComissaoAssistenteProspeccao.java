package doubleFunctional;

import java.util.function.DoubleFunction;

public class CalculoComissaoAssistenteProspeccao implements DoubleFunction<Double> {
    @Override
    public Double apply(double precoVenda) {
        if (precoVenda <= 100) {
            return 1D;
        }
        return precoVenda / 50;
    }
}
