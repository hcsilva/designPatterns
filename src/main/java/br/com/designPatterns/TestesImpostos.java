package br.com.designPatterns;

import br.com.designPatterns.imposto.CalculadoraDeImpostos;
import br.com.designPatterns.imposto.ISS;
import br.com.designPatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ISS()));
    }
}
