# Prova.Met.Avac.Programacao
Repositório para a primeira avaliação da disciplina de Métodos avançados de programação.

Princípios de SOLID utilizados:

 1 - Princípio da responsabilidade única: Uma classe deve ter apenas um motivo para mudar, ou seja, uma classe deve ter apenas uma responsabilidade. No meu código, todas as classes e a interface seguem esse princípio.

2- Princípio Aberto-Fechado: Entidades devem estar abertas para extensões e fechadas para modificação. Caso necessite acrescentar algo ou fazer alguma mudança, o correto seria fazer um extends. Um trecho do código que aderiu esse princípio é a classe FcatoryCerveja que extends da classe base Cerveja.

3- Princípio da substituição de Liskov: Uma classe derivada pode ser substituível por sua classe base (classe mãe). Assim, poderemos chamar as classes que foram derivadas da classe mãe, sem ser necessário alterar as propriedades. No caso da classe Validade, que foi substituída pela classe Cerveja, e estendida em todas as classes de sabores das cervejas.

4- Princípio da Segregação da Interface: Uma classe não deve ser forçada a depender/ implementar métodos que não usam. No código, a interface MetodCerveja foi implementada nas classes do tipo da cerveja, e todas fizeram o uso do método.

5- Princípio da inversão da dependência: Dependa de abstrações e não de implementações. No código, a classe Cervejaria não faz ideia de qual classe será instanciada, assim evitando o acoplamento.
