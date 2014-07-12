package com.sam.design_patterns.singleton;

//防止多线程调用时，出现问题
public class Singleton1 {
	
	private static Singleton1 instance = new Singleton1();
	
	private Singleton1() {}
	
	public static Singleton1 getInstance() {
		return instance;
	}
}
