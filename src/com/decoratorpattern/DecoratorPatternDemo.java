package com.decoratorpattern;

public class DecoratorPatternDemo {
	public static void main(String[] args) {

	      Shape circle = new Circle();
	      Shape redCircle = new BorderShapeDecorator(new Circle());
	      Shape redRectangle = new BorderShapeDecorator(new Rectangle());
	      
	      System.out.println("Circle with normal border");
	      circle.draw();
	      
	      System.out.println("\nCircle of red border");
	      redCircle.draw();
	      
	      System.out.println("\nRectangle of red border");
	      redRectangle.draw();
	      
	      Shape blueCircle = new BlueShapeDecorator(new Circle());
	      Shape blueRectangle = new BlueShapeDecorator(new Rectangle());
	      
	      System.out.println("\nCircle of blue border");
	      blueCircle.draw();
	      
	      System.out.println("\nRectangle of blue border");
	      blueRectangle.draw();
	   }
}
