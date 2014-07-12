package thread;

public class MyThread implements Runnable{
	@Override
	public void run() {
		Instance instance = new Instance();
		for(int i = 0; i < 10; i++) {
			instance.fix(10);
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " : 当前foo对象的x值= " + instance.getX());
		}
	}

}
