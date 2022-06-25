<h1 align="center">:file_cabinet: Projeto Design Patterns Com Java</h1>

## Strategy
É um padrão de projeto comportamental. Permite definir novos conjuntos de algorítimos sem alterar as classes dos elementos sobre os quais opera. No padrão Strategy, criamos objetos que representam várias estratégias e um objeto de contexto cujo comportamento varia de acordo com o seu objeto de estratégia. Por exemplo:

- Problema inicial. Temos uma classe, CalculadoraDeImpostos, com um switch. Dentro de cada teste do switch temos a regra de negócio a ser aplicado. Sendo assim, cada vez que tivermos um novo imposto será necessário adicionar um novo teste:
![alt text](src/main/resources/imgs/strategy_1.png)

- Aqui temos um classe de teste para exemplificar:
![alt text](src/main/resources/imgs/strategy_2.png)

- Agora refatorando. Criamos uma Interface Imposto. Dentro dessa interface criamos um método calcular().
![alt text](src/main/resources/imgs/strategy_5.png)

- Criamos um classe ISS e ICMS, que implementam a interface Imposto. Agora, nestas classes colocamos as regras de negócio. Pois, sabemos qual é o cálculo a ser feito, para cada uma.

![alt text](src/main/resources/imgs/strategy_6.png)

![alt text](src/main/resources/imgs/strategy_4.png)

- Aqui temos a refatoração da classe CalculadoraDeImpostos. Acabamos com todos aqueles testes e passamos por parâmetro somente a interface Imposto.

![alt text](src/main/resources/imgs/strategy_3.png)

- Agora, nos nossos testes, precisamos passar por parâmetro somente a classe correspondente ao desconto que queremos.

![alt text](src/main/resources/imgs/strategy_7.png)

## Chain of Responsability
É um padrão de projeto  comportamental. É usado para obter um acoplamento flexível no design de software, onde uma solicitação é passada por uma cadeia de objetos para processa-la. Encadear os recpetores, passando a solicitação ao longo da cadeia até que um objeto a trate.

- Problema Inicial. Temos a Classe CalculadoraDeDescontos. Nessa classe não sabemos exatamente qual o valor do desconto, diferentemente da CalculadoraDeImpostos que sabíamos o que cada imposto deveria descontar. Neste caso temos um série de condições que podem dar desconto.

![alt text](src/main/resources/imgs/chainOfResponsability_2.png)

- Criamos uma classe Abstrata Desconto.

![alt text](src/main/resources/imgs/chainOfResponsability_3.png)

- Criamos uma Classe para Calcular o Desconto para orçamentos com mais de 5 itens.

![alt text](src/main/resources/imgs/chainOfResponsability_4.png)

- Criamos uma Classe para Calcular o Desconto para orçamentos com valor maior que 500 reais.

![alt text](src/main/resources/imgs/chainOfResponsability_5.png)

- Criamos uma Classe SemDesconto, para caso não entre em nenhuma das anteriores seja encerrado o processo.

![alt text](src/main/resources/imgs/chainOfResponsability_6.png)

- A nova montagem da regra de calcular desconto. Nesse caso passamos o orçamento como parâmetro, e o método vai seguindo uma cadeia para validar os desconto e por final cai no sem desconto.

![alt text](src/main/resources/imgs/chainOfResponsability_7.png)

- Chamanda do teste:

![alt text](src/main/resources/imgs/chainOfResponsability_1.png)
