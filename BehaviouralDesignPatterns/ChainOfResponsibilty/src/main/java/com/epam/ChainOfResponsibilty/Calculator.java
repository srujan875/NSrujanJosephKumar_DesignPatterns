package com.epam.ChainOfResponsibilty;

public interface Calculator {
	
		    public void setNextCalculation(Calculator nextCalculation);
		
		    public void calculate(Numbers request);
		
		}
