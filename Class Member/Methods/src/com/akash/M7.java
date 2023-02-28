package com.akash;
/*

Output
main begin: 10
from test: 20
main end: 10

 */
public class M7 {
	//Method Method
	public static void main(String[] args) {
		//Local
		int i = 10;
		System.out.println("main begin: " + i);
		//calling Method
		test();
		System.out.println("main end: " + i);
	}
	//Function
	public static void test() {
		//local
		int i = 20;
		System.out.println("from test: " + i);
	}
}
