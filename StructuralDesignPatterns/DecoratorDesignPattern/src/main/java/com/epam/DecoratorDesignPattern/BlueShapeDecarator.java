package com.epam.DecoratorDesignPattern;

public class BlueShapeDecarator extends ShapeDecarator{
	public BlueShapeDecarator(Shape decoratedShape) {
	      super(decoratedShape);		
	   }

	   @Override
	   public void draw() {
	      decoratedShape.draw();	       
	      setRedBorder(decoratedShape);
	   }

	   private void setRedBorder(Shape decoratedShape){
	      System.out.println("Border Color: Red");
	   }

}
