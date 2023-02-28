package com.akash;
/*

Output
main begin
from test1
----------
from test2
main end

 */
public class M9 {
	//Method Method
	public static void main(String[] args) {
		System.out.println("main begin");
		//calling
		test1();
		//separator
		System.out.println("----------");
		//calling
		test2();
		System.out.println("main end");
	}
	//Function
	public static void test1() {
		System.out.println("from test1");
	}
	//Function
	public static void test2() {
		System.out.println("from test2");
	}
}
