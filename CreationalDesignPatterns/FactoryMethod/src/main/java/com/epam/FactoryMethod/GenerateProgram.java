package com.epam.FactoryMethod;

public class GenerateProgram {
	  public StudentProgram getProgramName(String pname){  
          
        if(pname.equalsIgnoreCase("MTECH")) {  
               return new MTech();  
             }   
         else if(pname.equalsIgnoreCase("BTECH")){  
              return new BTech();  
          }   
        
    return null;  
 }  
}
