package com.epam.AdapterDesignPattern;
public class RectangularPlug {
public void getPower(String rectastem1,String rectastem2) {
	RectangularAdapter r=new RectangularAdapter();
	int watt=r.adapt(rectastem1,rectastem2);
	System.out.print("The watts Supplied is: "+watt);
}
public static void main(String ags[]){
	RectangularPlug p=new RectangularPlug();
	p.getPower("5", "6");
	
}
}
