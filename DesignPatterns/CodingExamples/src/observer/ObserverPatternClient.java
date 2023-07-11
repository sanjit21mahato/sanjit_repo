package observer;

public class ObserverPatternClient {

	public static void main(String[] args) {


		WeatherStationObservable ws = new WeatherStationObservable();
		MobileDisplayObserver md = new MobileDisplayObserver(ws);
		TVDisplayObserver tvd = new TVDisplayObserver(ws);
		ws.add(md);
		ws.add(tvd);
		ws.setTemperature(30);

	}

}
