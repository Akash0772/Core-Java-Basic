package com.akash;
/*

Output
main begin
from test
-----------
from test
-----------
from test
-----------
from test
main end

 */
public class M5 {
	//Method Method
	public static void main(String[] args) {
		System.out.println("main begin");
		//calling Method
		test();
		System.out.println("-----------");
		//calling Method
		test();
		System.out.println("-----------");
		//calling Method
		test();
		System.out.println("-----------");
		//calling Method
		test();
		System.out.println("main end");
	}
	//Function
	public static void test() {
		System.out.println("from test");
	}
}
