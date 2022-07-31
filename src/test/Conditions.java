package test;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=19;
		
		if(age>=18)
		{
			System.out.println(" can vote");
			
		}
		
		else if(age==17)
		{
			System.out.println(" wait for one year");
		}
		
		else
		{
			System.out.println("can't vote");
		}
	}

}
