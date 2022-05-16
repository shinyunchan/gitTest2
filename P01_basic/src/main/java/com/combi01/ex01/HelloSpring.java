package com.combi01.ex01;

public class HelloSpring {

	public static void main(String[] args) {
		
		MessageBeanEn beanA = new MessageBeanEn();
		beanA.sayHello();
		
		System.out.println();
		
		MessageBeanKr beanB = new MessageBeanKr();
		beanB.sayHello();
		System.out.println();
		
	}
	
}

