package br.com.designPatterns;

import br.com.designPatterns.desconto.CalculadoraDeDesconto;
import br.com.designPatterns.imposto.CalculadoraDeImpostos;
import br.com.designPatterns.imposto.ISS;
import br.com.designPatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDesconto {
    public static void main(String[] args) {
        Orcamento orcamentoPrimeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamentoSegundo = new Orcamento(new BigDecimal("1000"), 1);
        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
        System.out.println(calculadora.calcular(orcamentoPrimeiro));
        System.out.println(calculadora.calcular(orcamentoSegundo));
    }
}
