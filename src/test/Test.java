package test;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Test {
	private int a;
	public String b = "hello";
	
	{
		System.out.println("init a");
	}
	
	static{
		System.out.println("init b");
	}
	
	public Test() {
		System.out.println("init c");
	}
	
	public Test(int num) {
		System.out.println("create Test: " + num);
	}
	
	public void change(List list, String str) {
		str.replace('1', '2');
		list.add("b");
		System.out.println("1: " + list.hashCode());
		list = new ArrayList<String>();
		list.add("c");
		System.out.println("2: " + list.hashCode());
	}
	
	@Override
	public String toString() {
		return this + "'s hashCode is " + hashCode();
	}
	
	public class A {
		
		public A() {
			System.out.println("init b");
		}
		
		public A(int num) {
			System.out.println("create A: " + num);
		}
	}
	
	public class B extends A {
		public B(){};
		public B(int num) {
			System.out.println("create B: " + num);
		}
	}
	
	final static char [] DigitTens = {
		'0', '0', '0', '0', '0', '0', '0', '0', '0', '0',
		'1', '1', '1', '1', '1', '1', '1', '1', '1', '1',
		'2', '2', '2', '2', '2', '2', '2', '2', '2', '2',
		'3', '3', '3', '3', '3', '3', '3', '3', '3', '3',
		'4', '4', '4', '4', '4', '4', '4', '4', '4', '4',
		'5', '5', '5', '5', '5', '5', '5', '5', '5', '5',
		'6', '6', '6', '6', '6', '6', '6', '6', '6', '6',
		'7', '7', '7', '7', '7', '7', '7', '7', '7', '7',
		'8', '8', '8', '8', '8', '8', '8', '8', '8', '8',
		'9', '9', '9', '9', '9', '9', '9', '9', '9', '9',
		} ; 

	    final static char [] DigitOnes = { 
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
		} ;
	    
	public int testException() {
		try {
			System.out.println("exception");
			throw new InputMismatchException();
		}catch (InputMismatchException w){
			System.out.println("excption 1");
			return 1;
		} catch (Exception e) {
			System.out.println("excption 2");
			return 2;
		} finally {
			System.out.println("finally");
			return 3;
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("init d");
		Test test = new Test();
		Test test1 = new Test();
		System.out.println("init e");
		System.out.println("-------------------------------------\n");
		A a = test.new A(10);
		B b = test.new B(11);
		System.out.println("-------------------------------------\n");
		String str = "1";
		List<String> list = new ArrayList<String>();
		System.out.println("3: " + list.hashCode());
		list.add("a");
		test.change(list, str);
		System.out.println("4: " + list.hashCode());
		for(String st : list) {
			System.out.println(st);
		}
		System.out.println(str);
		System.out.println("-------------------------------------\n");
		System.out.println(test.testException());
		
		System.out.println("Aaca".hashCode());
		System.out.println("BBca".hashCode());
	}
	
	private int hash;
	private char[] val;
	private int offset = 0;
	private int count;
	
	public Test(String hello) {
		this.val = hello.toCharArray();
		this.count = hello.length();
	}
	
	public int hashCode() {
		int h = hash;
        int len = count;
	if (h == 0 && len > 0) {
	    int off = offset;
            for (int i = 0; i < len; i++) {
                h = 31*h + val[off++];
            }
            hash = h;
        }
        return h;
    }
}


