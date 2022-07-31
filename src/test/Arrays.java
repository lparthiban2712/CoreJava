package test;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,20,30,40,50};
		System.out.println(array.length);
		System.out.println(array[2]);
		String[] words= {"parthi", "priya", "dev", "hem"};
		System.out.println(words.length);
		String content= "Welcome to Automation Testing Program";
		
		String[] splitted= content.split(" ");
		System.out.println(splitted[1]);


	}

}
