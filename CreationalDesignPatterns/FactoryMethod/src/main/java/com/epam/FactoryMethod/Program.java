package com.epam.FactoryMethod;
import java.io.*;    
public class Program {
	public static void main(String args[])throws IOException{  
		GenerateProgram gp = new GenerateProgram();  
	        
	      System.out.print("Program: ");  
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	  
	      String pname=br.readLine();  
	     
	  
	      StudentProgram sp = gp.getProgramName(pname);  
	      //call getRate() method and calculateBill()method of DomesticPaln.  
	  
	       System.out.print("The program you have choosen is "+pname );  
	           sp.getProgram();  
	           sp.getClgName();  
	            }  
}
