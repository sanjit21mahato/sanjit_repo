package observer;

public class MobileDisplayObserver implements ObserverInterface{
	ObserverableInterface observerable;
	MobileDisplayObserver(ObserverableInterface observerable) {
		this.observerable = observerable;
	}

@Override
public void displayTemperature(int data) {
	System.out.println("In Mobile Display:"+data );
	
}

@Override
	public void updateTemperatureChanges() {
	int temp = observerable.getChangedTemperature();
     if(temp > 27){
    	 displayTemperature(temp);
     }
		
	}
}
