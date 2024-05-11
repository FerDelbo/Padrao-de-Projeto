# Padrão-de-Projeto
Repositório dedicado para atividade de engenharia de software 2024/1
Antes de tudo, é importante entender que padrões de projeto visam a criação de projetos de software flexíveis e extensíveis.

## Padrão Comportamental: Observador (Observer)
O padrão Observer é usado quando existe uma relação de dependência um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente. Ele é reolvido da seguinte forma: Os observadores se inscrevam no objeto sujeito e recebam notificações quando o estado do sujeito é alterado. Dessa forma, os observadores podem reagir às mudanças de estado do sujeito sem que o sujeito precise conhecer detalhes sobre os observadores. Isso promove um baixo acoplamento entre o sujeito e os observadores.
```
// Subject (Assunto)
interface Subject {
	void addObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObservers();
}

// Concrete Subject (Assunto Concreto)
class WeatherStation implements Subject {
	private int temperature;
	private List<Observer> observers = new ArrayList<>();

	public void setTemperature(int temperature) {
    	this.temperature = temperature;
    	notifyObservers();
	}


	public void addObserver(Observer observer) {
        ...
    }


	public void removeObserver(Observer observer) {
        ...
	}


	public void notifyObservers() {
        ...
	}
}

// Observer (Observador)
interface Observer {
	void update(int temperature);
}

// Concrete Observer (Observador Concreto)
class Display implements Observer {

	public void update(int temperature) {
    	System.out.println("New temperature: " + temperature);
	}
} 
```
Neste exemplo, `WeatherStation` é o sujeito que mantém uma lista de observadores (como `Display`). Quando a temperatura é atualizada, todos os observadores são notificados automaticamente.

## Padrão Criacional: Fábrica (Factory Method)
O padrão Factory Method é usado para encapsular a criação de objetos. Ele define uma interface para criar um objeto, mas permite às subclasses alterar o tipo de objetos que serão criados. Da maenira com que um método na superclasse é usado para criar um objeto, mas delegando a implementação desse método para as subclasses.
```
// Product (Produto)
interface Product {
	void doSomething();
}

// Concrete Product (Produto Concreto)
class ConcreteProduct implements Product {
	public void doSomething() {
        ...	
    }
}

// Creator (Criador)
abstract class Creator {
	abstract Product createProduct();
	void useProduct() {
    	Product product = createProduct();
    	product.doSomething();
	}
}

// Concrete Creator (Criador Concreto)
class ConcreteCreator extends Creator {
	Product createProduct() {
    	return new ConcreteProduct();
	}
}
```
Neste exemplo, `Creator` define um método abstrato `createProduct()`, que as subclasses implementam para criar produtos específicos. `ConcreteCreator` implementa `createProduct()` para criar instâncias de `ConcreteProduct`.

## Padrão Estrutural: Adaptador (Adapter)
O padrão Adapter é usado para permitir que interfaces incompatíveis trabalhem juntas. Ele converte a interface de uma classe em outra interface que um cliente espera encontrar.Assim, há a criação de um adaptador que atua como uma ponte entre as duas interfaces incompatíveis. O adaptador converte a interface de uma classe para a interface esperada pelo cliente, permitindo que essas classes trabalhem juntas sem precisar modificar seu código.
```
// Target (Alvo)
interface Target {
	void request();
}

// Adaptee (Adaptado)
class Adaptee {
	void specificRequest() {
        ...
    }
}

// Adapter (Adaptador)
class Adapter implements Target {
	private Adaptee adaptee;

	Adapter(Adaptee adaptee) {
    	this.adaptee = adaptee;
	}

	public void request() {
    	adaptee.specificRequest();
	}
} 
```
Neste exemplo, `Target` define a interface esperada pelo cliente. `Adaptee` possui uma interface incompatível com `Target`. `Adapter` conecta `Target` com `Adaptee`, permitindo que o cliente invoque `specificRequest()` através de `request()`.