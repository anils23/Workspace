package com.te.methodReference;

public class Main {
	
	Main(){
		System.out.println("Constructor");
	}

	public void tes() {
		System.out.println("tes method of main class");
	}

	public void demo() {
		System.out.println("demo method of main class");
	}
	
	public static String test1() {
		return "hello";
	}

	public static void main(String[] args) {
		
		Test t = new Test() {
			
			@Override
			public void m1() {
				
			}
			
			
			
		};

//		Test t = new Main()::tes;
//		t.m1();
//
//		Object object = new Object();
//		Test test = object::toString;        // for non static method use obj_ref_var
//		String a =test.m1();
		
//		Test t = Main::test1;                // for static method use class name
//		String a=t.m1();
//		System.out.println(a);
		
//		Test t = Main::new;
//		t.m1();                              // for constructor use new keyword 
		
		Test.m2();
	}

}
