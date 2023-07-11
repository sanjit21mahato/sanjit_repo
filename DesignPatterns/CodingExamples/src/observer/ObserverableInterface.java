package observer;

public interface ObserverableInterface {

	void add(ObserverInterface observerInterface);
	void remove(ObserverInterface observerInterface);
	void notifyChanges();
	int getChangedTemperature();
}
