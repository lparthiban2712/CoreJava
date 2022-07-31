package test;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=2;
		
		while(num<=10)
		{
			/*if(num==6)
			{
				num=num+2;
				break;
			}*/
			
			if(num==6)
			{
				
			}
			
			else
			{
				
			
			System.out.println(num);
			
			}
			num=num+2;
		}
		
		for(int i=1;i<=10;i++)
		{
			if (i==5)
			{
				break;
			}
			System.out.println(i);
		}
		
		int[] arr= {5,10,15,20};
		for (int i : arr) {
			System.out.println(i);
			
		}
	}

}
