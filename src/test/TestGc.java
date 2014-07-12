package test;

public class TestGc {
	public Object innstance = null;
	
	private static final int _1MB = 1024*1024;
	
	private byte[] bigSize = new byte[2*_1MB];
    public static void testGc() {
    	TestGc a = new TestGc();
    	TestGc b = new TestGc();
    	a.innstance = b;
    	b.innstance = a;
    	System.gc();
    }
    
    
    public static TestGc SAVE_HOOK = null;
    
    public void isAlive() {
    	System.out.println("Yes, I'm still alive :)");
    }
    
    public void isDead() {
    	System.out.println("Oh no, I'm dead :(");
    }
    
    @Override
    protected void finalize() throws Throwable {
    	super.finalize();
    	System.out.println("finalize method executed!");
    }
    
    public static void testGc1() throws Throwable{
    	SAVE_HOOK = new TestGc();
    	SAVE_HOOK = null;
    	System.gc();
    	Thread.sleep(1000);
    	if(SAVE_HOOK != null) {
    		SAVE_HOOK.isAlive();
    	} else {
    		System.out.println("Oh no, I'm dead :(");
    	}
    	
    	SAVE_HOOK = null;
    	System.gc();
    	Thread.sleep(1000);
    	if(SAVE_HOOK != null) {
    		SAVE_HOOK.isAlive();
    	} else {
    		System.out.println("Oh no, I'm dead :(");
    	}
    }
    
    public static void main(String[] args) {
    	try {
			TestGc.testGc1();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
