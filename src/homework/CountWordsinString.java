package homework;

public class CountWordsinString {
	
	public static void main(String[] args)
	{
		char letter;
		int count=1;
		String words="Mater Test Automation Course";
		
		String[] sp=words.split(" ");
		System.out.println(sp.length);
		for (int i=1; i<words.length();i++)
		{
			letter=words.charAt(i);
			
			if(letter==' ')
			{
				count++;
			}
			
			//System.out.println(count);
			
			
		}
		System.out.println(count);
		
	}

}
