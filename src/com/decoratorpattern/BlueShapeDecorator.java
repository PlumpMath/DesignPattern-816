package com.decoratorpattern;

public class BlueShapeDecorator extends ShapeDecorator {

	public BlueShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		super.draw();
		setBlueBorder(decoratedShape);
	}
	
	private void setBlueBorder(Shape decoratedShape) {
		System.out.println("Border Color: Blue");
	}
}
