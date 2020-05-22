package br.com.codenation.calculadora;


import br.com.codenation.calculadora.impostos.INSS;
import br.com.codenation.calculadora.impostos.IRRF;

import static br.com.codenation.calculadora.impostos.CalculadoraDeImposto.calularImposto;

public class CalculadoraSalario {

    /**
     * Dado um salario base, aplica os descontos de INSS e IRRF
     *
     * @param salarioBase
     * @return
     */
    public long calcularSalarioLiquido(double salarioBase) {

        double salarioMinimo = 1039.00;

        // Caso o valor do salário base recebido seja abaixo do salário mínimo (R$ 1.039,00), o algoritmo deve retornar 0.0.
        if (salarioMinimo > salarioBase) {
            return 0;
        }

        final double salarioBaseMenosInss = calularImposto(salarioBase, new INSS());

        final double salarioLiquido = calularImposto(salarioBaseMenosInss, new IRRF());

        return Math.round(salarioLiquido);
    }

}