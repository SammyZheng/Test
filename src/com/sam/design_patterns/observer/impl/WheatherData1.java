package com.sam.design_patterns.observer.impl;

import java.util.Observable;

public class WheatherData1 extends Observable{
		private float temp;
		private float humidity;
		private float pressure;
		
		public WheatherData1(){}

		/**
		 * 天气改变
		 */
		public void wheatherChanged() {
			setChanged();
			notifyObservers();
		}
		
		public void setWheatherData(float temp, float humidity, float pressure) {
			this.temp = temp;
			this.humidity = humidity;
			this.pressure = pressure;
			wheatherChanged();
		}

		public float getTemp() {
			return temp;
		}

		public void setTemp(float temp) {
			this.temp = temp;
		}

		public float getHumidity() {
			return humidity;
		}

		public void setHumidity(float humidity) {
			this.humidity = humidity;
		}

		public float getPressure() {
			return pressure;
		}

		public void setPressure(float pressure) {
			this.pressure = pressure;
		}
}
