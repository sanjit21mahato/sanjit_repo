package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservable implements ObserverableInterface{

	List<ObserverInterface> list = new ArrayList<>();
	private int temperature;

	@Override
	public int getChangedTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
		if(temperature >27){
			notifyChanges();
		}
	}

	@Override
	public void add(ObserverInterface observerInterface) {
		list.add(observerInterface);
		
	}

	@Override
	public void remove(ObserverInterface observerInterface) {
		list.remove(observerInterface);
		
	}

	@Override
	public void notifyChanges() {

      for(ObserverInterface observer:list) {
    	  observer.updateTemperatureChanges();
      }
		
	}
	
	
}
