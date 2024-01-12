package week1.day2;

import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		  Scanner b = new Scanner(System.in);
		  System.out.println("Enter any number :");
		  int a = b.nextInt();
		    /* if((a==0)||(a==1)) {
		    	 System.out.println("0 and 1 is not Prime number because the prime number can only be divided by the number 1 and itself.");
		     }
		     else if((a%1==0)&&(a%a==0)&&(a%2==0)){
		    	 System.out.println("Entered number is prime");
		     }
		     else {
		    	 System.out.println("Entered number is not prime");
		     }*/
		  boolean flag = false;

		    for (int i = 2; i <= a / 2; ++i) {
		      // condition for nonprime number
		      if (a % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag) {
		      System.out.println(a + " is a prime number.");
		    }
		    else {
		      System.out.println(a + " is not a prime number.");
		    }
				
		    	 
		    	 
				
	}
}


	
				

		


