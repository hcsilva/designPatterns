package br.com.designPatterns.imposto;

import br.com.designPatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
