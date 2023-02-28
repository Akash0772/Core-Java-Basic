package com.akash;
/*

Output
main begin
from test
------------
from test
100 in the main:
-----------------------
from test
210 in the main:
----------------
from test
from test
310 in the main:
---------------------
from test
from test
from test
@d: 110100100100
main end

 */
public class M29 {
	 public static void main(String[] args) {
		System.out.println("main begin"); // 1st Line main begin
		int i = 10 + test(); //2nd Line from test
//				10 + 100 == 110	
		System.out.println("------------"); // 3rd Line ---------------
		System.out.println(test() + " in the main:"); // 4th Line from test
		System.out.println("-----------------------");
		System.out.println(i + test() + " in the main:"); // 5th Line 210 in the main
//		                   10 + 100
		System.out.println("----------------"); // 6th Line ---------------
		System.out.println(i + test() + test() + " in the main:"); // 7th and 8th Line from test and 9th Line 
		System.out.println("---------------------");
		System.out.println("@d: " + i + test() + test() + test());
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

