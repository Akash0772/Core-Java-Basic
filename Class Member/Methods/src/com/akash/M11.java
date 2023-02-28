package com.akash;
/*

Output
Run time Error
Exception in thread "main" java.lang.StackOverflowError

 */
public class M11 {
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
		System.out.println("from test1 begin");
//		calling
		test2();
		System.out.println("from test1 end");
	}
	//Function
	public static void test2() {
		System.out.println("from test2 begin");
//		calling
		test1();
		System.out.println("from test2 end");
	}
}
