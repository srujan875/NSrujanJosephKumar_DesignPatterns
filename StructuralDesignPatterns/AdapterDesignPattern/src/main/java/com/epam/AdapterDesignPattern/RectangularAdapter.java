package com.epam.AdapterDesignPattern;
import java.lang.Integer;
public class RectangularAdapter extends CylindricalSocket {
	public int adapt(String rectastem1,String rectastem2) {
		int cylinstem1=Integer.parseInt(rectastem1);
		int cylinstem2=Integer.parseInt(rectastem2);
		return supply(cylinstem1,cylinstem2);
	}
}
