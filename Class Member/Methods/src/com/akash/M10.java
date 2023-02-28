package com.akash;
/*

Output
main begin
from test1 begin
from test2
from test1 end
----------
from test2
main end

 */
public class M10 {
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
		System.out.println("from test2");
	}
}
