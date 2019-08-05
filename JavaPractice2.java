package com.sapient.javaPractice;

public class JavaPractice2 extends JavaPractice{
	
	public void ab() {
		
		System.out.println("Under Child Class");
	}
	
	public static void main(String[] args) {
		
		JavaPractice jp= new JavaPractice();
		
		jp.ab();
		
	}

}
