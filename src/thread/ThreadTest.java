package thread;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest {
	

	public static void main(String[] args) {
		ThreadB b=new ThreadB();
		System.out.println("b is start....");
		synchronized(b){//括号里的b是什么意思,起什么作用?
			try{
				System.out.println("Waiting for b to complete...");
				b.wait();//这一句是什么意思，究竟让谁wait?
				System.out.println("Completed.Now back to main thread");
				b.start();
			}catch (InterruptedException e){}
		}
		System.out.println("Total is :"+b.total);
	}
}

class ThreadB extends Thread {
	int total;
	ReentrantLock lock;
	public void run(){
		synchronized(this) {
			System.out.println("ThreadB is running..");
			for (int i=0;i<100;i++ ) {
				total +=i;
				System.out.println("total is "+total);
			}
			notify();
		}
	}
}
