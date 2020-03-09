package com.epam.FactoryMethod;

abstract class StudentProgram {
   static String clg="K L University";  
    abstract void getProgram();  

    public void getClgName(){  
         System.out.println("Univesity Name is"+clg);  
     }  
}
