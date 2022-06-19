package br.com.designPatterns.desconto;

import br.com.designPatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto =
                new DescontoParaOrcamentoComMaisDeCincoItens(
                        new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                                new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
