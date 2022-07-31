package test;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint 
		int num=123456;
		int rem=0;
		int result=0;
		while(num>0)
		{
			rem=num%10;
			result=result*10+rem;
			num=num/10;
		}
	System.out.println(result);
	}

}
