package homework;

import java.util.Scanner;

public class EvenorOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter the number");
		int num=s.nextInt();
		//System.out.println(num);
		if(num%2==0)
		{
			System.out.println("Even number");
		}
		
		else
		{
			System.out.println(" Odd numbers");
		}

	}

}
