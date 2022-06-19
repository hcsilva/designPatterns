package br.com.designPatterns.imposto;

import br.com.designPatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS implements Imposto{

    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
