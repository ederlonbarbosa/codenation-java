package br.com.codenation.calculadora.impostos;

import com.google.common.collect.Range;

public class FaixaSalarial {

    private Double valorImposto;
    private Range faixaSalarial;

    public FaixaSalarial(final Double valorMinimo, final Double valorMaximo, final Double valorImposto) {
        this.valorImposto = valorImposto;
        faixaSalarial = Range.closed(valorMinimo, valorMaximo);
    }

    public Double getValorImposto() {
        return valorImposto;
    }

    public boolean valorEstaNaFaixa(double salarioBase) {
        return faixaSalarial.contains(salarioBase);
    }


}
