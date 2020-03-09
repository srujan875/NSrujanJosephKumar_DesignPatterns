package com.epam.ChainOfResponsibilty;


public class Calculations 
{
public static void main(String[] args){
		
		// Here I define all of the objects in the chain
		
		Calculator calculation1 = new AddNumbers();
		Calculator calculation2 = new SubtractNumbers();
		Calculator calculation3 = new MultiplyNumbers();
		
		
		// Here I tell each object where to forward the
		// data if it can't process the request
		
		calculation1.setNextCalculation(calculation2);
		calculation2.setNextCalculation(calculation3);
		
		// Define the data in the Numbers Object
		// and send it to the first Object in the chain
		
		Numbers request1 = new Numbers(4,2,"add");
		
		Numbers request2 =new Numbers(4,2,"mult");
		
		calculation1.calculate(request1);
		calculation2.calculate(request2);
		
	}

}
