package com.decoratorpattern;

public class BorderShapeDecorator extends RedShapeDecorator {

	public BorderShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void draw() {
		super.draw();
		drawBorder(decoratedShape);
	}

	private void drawBorder(Shape decoratorShape) {
		System.out.println("Border: Bold");
	}
}
