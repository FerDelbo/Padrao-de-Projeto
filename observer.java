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