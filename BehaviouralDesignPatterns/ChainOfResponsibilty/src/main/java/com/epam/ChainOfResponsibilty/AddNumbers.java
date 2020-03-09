package com.epam.ChainOfResponsibilty;

public class AddNumbers implements Calculator{

private  Calculator nextInCalculation;
	
	
public void setNextCalculation(Calculator nextCalculation) {
		
		nextInCalculation = nextCalculation;
		
	}

	
	
	public void calculate(Numbers request) {
		
		if(request.getCalcWanted() == "add"){
			
			System.out.println(request.getNumber1() + " + " + request.getNumber2() + " = "+
					(request.getNumber1()+request.getNumber2()));
			
		} else {
			
			nextInCalculation.calculate(request);
			
		}
		
	}
}
