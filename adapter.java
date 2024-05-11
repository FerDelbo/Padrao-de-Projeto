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