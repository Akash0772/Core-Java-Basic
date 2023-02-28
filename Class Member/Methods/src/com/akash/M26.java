package com.akash;
/*

Output
Compilation Error
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Type mismatch: cannot convert from int to boolean

	at com.akash.M26.main(M26.java:14)

 */
public class M26 {
	 public static void main(String[] args) {
		System.out.println("main begin");
		boolean i = test();
		System.out.println("in the main: " + i);
		System.out.println("main end");
	}
	 public static int test() {
		System.out.println("from test");
		return 100;
	}
}
/*
	primitive data type
	-------------------
	1. byte
	2. short
	3. int
	4. long
	5. float
	6. double
	7. char
	8. boolean

 */

