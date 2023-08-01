package com.lumen.fun;

public class FunMain {

	public static void main(String[] args) {
		ShapeFactory rectangle=new ShapeFactory();
		rectangle.printArea((double x,double y)->x*y, 10.0, 20.0);
		ShapeFactory triangle=new ShapeFactory();
		triangle.printArea((double x,double y)->0.5*x*y, 10, 20);
		
	}
	

}
