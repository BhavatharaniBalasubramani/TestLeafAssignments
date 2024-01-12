package week1.day1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		 int input,temp,i,rem;
  	    Scanner sc=new Scanner(System.in);
  	    System.out.print("Enter any number: ");
        input=sc.nextInt();
			temp=input;
			for(i=0;input>0;input/=10)
			{
			rem=input%10;
			i=(i*10)+rem;
			}
			if(i==temp){
			System.out.println(temp+" is a palindrome number ");
			}
			else{
			System.out.println(temp+" is not a palindrome number ");
			}
			       
}
}
