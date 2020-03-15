package chap02Observer.Observable;

import java.util.Observable;

public class WeatherDataObservable extends Observable{
	private float temper;
	private float humid;
	private float pressure;
	
	public WeatherDataObservable() {
		//Observer를 저장하는 자료구조 필요없음
	}
	
	public void measurementsChanged() {
		setChanged();		//Observer에 알리기 전에 상태 변경을 먼저 알림
		notifyObservers();
	}
	
	public void setMeasurements(float temper, float humid, float pressure) {
		this.temper = temper;
		this.humid = humid;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public float getTemperature() {		//Observer에서 데이터를 받아가는 방식. pull 방식
		return temper;
	}
	
	public float getHumidity() {
		return humid;
	}
	
	public float getPressure() {
		return pressure;
	}
}
