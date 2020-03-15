package chap02Observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
	private ArrayList<Observer> observers;
	private float temper;
	private float humid;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}
	
	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if(i >= 0)
			observers.remove(i);
	}
	
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(int i=0; i<observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(temper, humid, pressure);		//모든 Observer에게 알려준다. push 방식
		}
	}
	
	public void measurementsChanged() {
		notifyObserver();
	}
	
	public void setMeasurements(float temper, float humid, float pressure) {
		this.temper = temper;
		this.humid = humid;
		this.pressure = pressure;
		measurementsChanged();
	}
}
