package com.te.variables;

public class Test {

	public static void main(String[] args) {
		int a=80, b=200, c=90, d=40, e=180;
		
		System.out.println(a>b && a>c && a>d && a>e?a:b>c && b>d && b>e?b:c>d && c>e?c:d>e?d:e);
	}
}
