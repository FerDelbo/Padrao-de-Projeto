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

