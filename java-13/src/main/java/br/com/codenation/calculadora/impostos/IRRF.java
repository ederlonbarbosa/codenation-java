package br.com.codenation.calculadora.impostos;

import java.util.HashSet;
import java.util.Set;

public class IRRF implements Imposto {

    private static Set<FaixaSalarial> faixasSalariais = new HashSet<>();

    @Override
    public Set<FaixaSalarial> getFaixasSalariais() {

        if (faixasSalariais.size() > 0) return faixasSalariais;

        faixasSalariais.add(new FaixaSalarial(0.0, 3000.0, 0.0));
        faixasSalariais.add(new FaixaSalarial(3000.01, 6000.0, 0.075));
        faixasSalariais.add(new FaixaSalarial(6000.01, Double.MAX_VALUE, 0.15));

        return faixasSalariais;
    }
}
