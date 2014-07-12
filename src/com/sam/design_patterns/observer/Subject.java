package com.sam.design_patterns.observer;

public interface Subject {
	/**
	 * 订阅主题
	 */
	public void register(Observer o);
	
	/**
	 * 取消订阅
	 * @param o
	 */
	public void remove(Observer o);
	
	/**
	 * 通知所有观察者
	 */
	public void nodifyAll();
}
