package homework1.tempConverter;

import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  resault="";
		String y= "y";
		 Scanner scn = new Scanner(System.in);
		do {
			
        System.out.println("----------welcome---------");
        System.out.println("-celcius/ferrienheit/ferin-celsius converter ");
        
        int a1=1 ;
        int a2= 2;
        System.out.println("please choose one option ");
        System.out.println(a1 +"  fahrenheit to celcius ");
        System.out.println(a2 +"  celcius to fahrenheit");
    
        int res= scn.nextInt();
        if( res== a1) {
        	System.out.println("please enter the value in fahrenheit ");
        	 int fer= scn.nextInt();
        	 int cel = (fer-32)*5/9;
        	 System.out.println("the temperature "+fer+" is "+ cel +" celcius ");
        	
        
        }
         if( res== a2) {
        	System.out.println("please enter the value in celcius ");
        	 int cel= scn.nextInt();
        	 int fer = (cel*9/5)+32;
        	 System.out.println("the temperature  "+cel+ "   "+ fer +"  fahrenheit ");
        	 
        
        }
       
        System.out.println("do you want to do another convertion y/n ");
        resault =scn.next();
        
         System.out.println("-----thank you--------  ");
         System.out.println("-------goodby---------");
        

		
		} while(resault.equals(y));
   
        
        
        } 
        
       
        
	}


