package br.com.codenation.calculadora.impostos;

import java.util.HashSet;
import java.util.Set;

public class INSS implements Imposto {

    private static Set<FaixaSalarial> faixasSalariais = new HashSet<>();

    @Override
    public Set<FaixaSalarial> getFaixasSalariais() {

        if (faixasSalariais.size() > 0) return faixasSalariais;

        faixasSalariais.add(new FaixaSalarial(0.0, 1500.0, 0.08));
        faixasSalariais.add(new FaixaSalarial(1500.01, 4000.0, 0.09));
        faixasSalariais.add(new FaixaSalarial(4000.01, Double.MAX_VALUE, 0.11));

        return faixasSalariais;
    }
}
