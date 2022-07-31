package test;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int num=0;
		boolean flag=false;
		System.out.println(" Enter the number");
		num=s.nextInt();
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=true;
				//System.out.println(" It is a prime number");
				break;
			}
		}
		
		if(flag==true)
		{
			System.out.println("it is not prime number");
		}
		
		else
		{
			System.out.println("prime number");
		}
		
		

	}

}
