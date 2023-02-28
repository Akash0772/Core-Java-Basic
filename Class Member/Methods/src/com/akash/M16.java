package com.akash;
/*

Output
main begin
test begin
if block
main end

 */
public class M16 {
	public static void main(String[] args) {
		System.out.println("main begin");
//		calling
		test();
		System.out.println("main end");
	}
	public static void test() {
		System.out.println("test begin");
//		Method return types Why
//		condition
		if(true) {
			System.out.println("if block");
			return;
		}
//		return line
		System.out.println("test end");
	}
}