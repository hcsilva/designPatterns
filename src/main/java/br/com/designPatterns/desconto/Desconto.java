package br.com.designPatterns.desconto;

import br.com.designPatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {
    protected Desconto proximo;

    public abstract BigDecimal calcular(Orcamento orcamento);

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }
}
