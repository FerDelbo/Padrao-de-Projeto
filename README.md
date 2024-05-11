# Padrão-de-Projeto
Repositório dedicado para atividade de engenharia de software 2024/1
Antes de tudo, é importante entender que padrões de projeto visam a criação de projetos de software flexíveis e extensíveis.

## Padrão Comportamental: Observador (Observer)
O padrão Observer é usado quando existe uma relação de dependência um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente. Ele é reolvido da seguinte forma: Os observadores se inscrevam no objeto sujeito e recebam notificações quando o estado do sujeito é alterado. Dessa forma, os observadores podem reagir às mudanças de estado do sujeito sem que o sujeito precise conhecer detalhes sobre os observadores. Isso promove um baixo acoplamento entre o sujeito e os observadores.
```
codigo 
```
## Padrão Criacional: Fábrica (Factory Method)
O padrão Factory Method é usado para encapsular a criação de objetos. Ele define uma interface para criar um objeto, mas permite às subclasses alterar o tipo de objetos que serão criados. Da maenira com que um método na superclasse é usado para criar um objeto, mas delegando a implementação desse método para as subclasses.
```
codigo 
```
## Padrão Estrutural: Adaptador (Adapter)
O padrão Adapter é usado para permitir que interfaces incompatíveis trabalhem juntas. Ele converte a interface de uma classe em outra interface que um cliente espera encontrar.Assim, há a criação de um adaptador que atua como uma ponte entre as duas interfaces incompatíveis. O adaptador converte a interface de uma classe para a interface esperada pelo cliente, permitindo que essas classes trabalhem juntas sem precisar modificar seu código.
```
codigo 
```
