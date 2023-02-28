package com.akash;
/*

Output
From Main
Compilation Error
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Type mismatch: cannot convert from boolean to int

	at com.akash.M22.test(M22.java:16)
	at com.akash.M22.main(M22.java:12)

 */
public class M22 {
	 public static void main(String[] args) {
		System.out.println("From Main");
		test();
	}
	 public static int test() {
		System.out.println("from test");
		return false;
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

