package com.testjvm.www;
/**
 * 此类用于演示桟溢出
 * java.lang.StackOverflowError
 * @author Administrator
 *
 */
public class TestJvmStack {
	public static void main(String[] args) {
		
		TestJvmStack TestJvmStack=new TestJvmStack();
		TestJvmStack.te();
	
	}

	
	public void te(){
		te();
		System.out.println("heh");
	}
	

}
