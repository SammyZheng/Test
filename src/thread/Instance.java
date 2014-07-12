package thread;

public class Instance {
	private int x = 100;
	
	public int getX() {
		return x;
	}
	
	public int fix(int y) {
		System.out.println("thread name: " + Thread.currentThread().getName());
		System.out.println("x: " + x);
		x = x - y;
		return x;
	}
}
