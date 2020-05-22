package br.com.codenation.calculadora.impostos;

public class CalculadoraDeImposto {

    /**
     * Dado um salarioBase e uma estratégia de calculo(imposto), é aplicado o desconto do imposto sobre o salarioBase
     *
     * @param salarioBase
     * @param imposto
     * @return
     */
    public static double calularImposto(final double salarioBase, final Imposto imposto) {

        double salarioMenosImposto = 0;

        for (FaixaSalarial faixaSalarial : imposto.getFaixasSalariais()) {
            if (faixaSalarial.valorEstaNaFaixa(salarioBase)) {
                salarioMenosImposto = salarioBase - (salarioBase * faixaSalarial.getValorImposto());
                break;
            }
        }
        return salarioMenosImposto;
    }

}
