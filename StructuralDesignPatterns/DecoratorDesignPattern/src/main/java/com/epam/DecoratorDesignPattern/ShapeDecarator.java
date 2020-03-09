package com.epam.DecoratorDesignPattern;

public abstract class ShapeDecarator implements Shape{
	protected Shape decoratedShape;

	   public ShapeDecarator(Shape decoratedShape){
	      this.decoratedShape = decoratedShape;
	   }

	   public void draw(){
	      decoratedShape.draw();
	   }	

}
