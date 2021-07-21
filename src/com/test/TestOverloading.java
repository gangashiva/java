package com.test;

public class TestOverloading {

	public static void main(String[] args) {
		float pi = 3.14f;
		TestOverloading tol = new TestOverloading();
		tol.area(pi, 10, 20);
		tol.area(4.5f, 5.5f);
		tol.area(40, 50);
	}
	public void area(float pi, int r1, int r2 ) {
		System.out.println("The area of circle is: "+pi*r1*r2);
	}
	public void area(float side_1, float side_2) {
		System.out.println("The area of Square is: "+side_1*side_2);
	}
	
	public void area(int len, int b) {
		System.out.println("The area of Rectangle is: "+len*b);
	}

}
