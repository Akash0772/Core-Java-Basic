package com.akash;
/*

Output
Compilation Error
From Main
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	This method must return a result of type int

	at com.akash.M21.test(M21.java:16)
	at com.akash.M21.main(M21.java:12)

 */
public class M21 {
	 public static void main(String[] args) {
		System.out.println("From Main");
		test();
	}
	 public static int test() {
		System.out.println("from test");
		return;
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

