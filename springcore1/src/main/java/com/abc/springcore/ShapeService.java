package com.abc.springcore;

public class ShapeService {
	
//	Shape shape = new Triangle();//dependency tight coupling
	
	private Shape shape;
	
	public void setShape(Shape shape) {
		this.shape=shape;
	}
	public double findArea() {
		double result= shape.area();
		return result;
		
		
	}

}
