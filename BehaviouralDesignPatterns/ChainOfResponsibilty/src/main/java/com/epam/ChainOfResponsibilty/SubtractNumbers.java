package com.epam.ChainOfResponsibilty;

public class SubtractNumbers  implements Calculator{

	private  Calculator nextInCalculation;
	
	
	public void setNextCalculation(Calculator nextCalculation) {
			
			nextInCalculation = nextCalculation;
			
		}


	public void calculate(Numbers request) {

if(request.getCalcWanted() == "sub"){
			
			System.out.println(request.getNumber1() + " - " + request.getNumber2() + " = "+
					(request.getNumber1()-request.getNumber2()));
			
		} else {
			
			nextInCalculation.calculate(request);
			
		}
	
		
	}
}
