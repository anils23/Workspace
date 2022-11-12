package com.te.spec;

 class Test implements Dog, Dog2, Dog3{
	 
	 public static void main(String[] args) {
	
		 Test test = new Test();
		 System.out.println(test.add(10, 20));
		 System.out.println(test.minus(100, 20));
		 System.out.println(test.multiplication(10, 10));
	}

	@Override
	public int minus(int x, int y) {
		return x-y;
	}

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int multiplication(int c, int d) {
		return c*d;
	}
	
}
