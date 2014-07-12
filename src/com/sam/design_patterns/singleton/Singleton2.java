package com.sam.design_patterns.singleton;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Singleton2 {
	
	private static volatile Singleton2 instance;
	
	private Singleton2() {}
	
	public static Singleton2 getInstance() {
		if(null == instance) {
			synchronized (Singleton2.class) {
				if(null == instance) {
					instance = new Singleton2();
				}
			}
		}
		return instance;
	}
	
	Executor executor;
	Executors executors;
	ExecutorService executorService;
	ThreadPoolExecutor threadPoolExecutor;
}
