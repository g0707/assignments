package org.capg.training;

import java.util.Scanner;

public class AmstrongNumber
{
public static void main(String[] args) {
	 int c=0,a,temp;
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("enter the number");
	 int n=scanner.nextInt();
	    temp=n;  
	    while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;  
	    c=c+(a*a*a);  
	    }  
	    if(temp==c)  
	    System.out.println("armstrong number");   
	    else  
	        System.out.println("Not armstrong number"); 
	    scanner.close();
}
}
