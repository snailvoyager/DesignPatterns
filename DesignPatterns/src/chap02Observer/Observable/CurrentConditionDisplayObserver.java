package chap02Observer.Observable;

import java.util.Observer;

import chap02Observer.DisplayElement;

import java.util.Observable;

public class CurrentConditionDisplayObserver implements Observer, DisplayElement{
	Observable observable;
	private float temper;
	private float humid;
	
	public CurrentConditionDisplayObserver(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);	//현재 객체를 Observer로 등록
	}
	
	public void update(Observable obs, Object arg) {	//Observer 인터페이스 update 구현
		if(obs instanceof WeatherDataObservable) {
			WeatherDataObservable weatherData = (WeatherDataObservable)obs;
			this.temper = weatherData.getTemperature();
			this.humid = weatherData.getHumidity();
			
			display();
		}
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions : " + temper + "F dgrees and " + humid + "% humid, HeatIndex : " + computeHeatIndex(temper, humid));
	}
	
	private float computeHeatIndex(float t, float rh) {		//체감온도 공식
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
            (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
            (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
            (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *  
            (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
            (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +     
            0.000000000843296 * (t * t * rh * rh * rh)) -
            (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }
}
