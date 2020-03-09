package com.epam.DecoratorDesignPattern;
import java.util.*;
import java.io.*;
public class DecaratorPatternDemo {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Shape and color with which it should be decarated:");
		 String s=sc.next();
		 String c=sc.next();
		 if(s.equalsIgnoreCase("rectangle")){
			 if(c.equalsIgnoreCase("red")) {
				 Shape redRectangle = new RedShapeDecarator(new Rectangle()); 
				 redRectangle.draw();
			 }
			 else {
				 Shape blueRectangle = new BlueShapeDecarator(new Rectangle());
				 blueRectangle.draw();
			 }
		 }
		 if(s.equalsIgnoreCase("circle")){
			 if(c.equalsIgnoreCase("red")) {
				 Shape redCircle = new RedShapeDecarator(new Circle()); 
				 redCircle.draw();
			 }
			 else {
				 Shape blueCircle = new BlueShapeDecarator(new Circle());
				 blueCircle.draw();
			 }
		 }
	    }
}
