package week1.day2;

import java.util.Arrays;

public class FindMissingElement 
{
	public static void main(String[] args) 
	{
		int num[]={1,4,3,2,8,6};
		int i;
		int a;
		
		Arrays.sort(num);
		for (i = 0; i < (num.length-1); i++) 
		{
			if((num[i]+1)!=num[i+1]) 
			{
				a = (num[i]+1);
				System.out.println("The missing number is:" +a);
			}
		}
	}
}
