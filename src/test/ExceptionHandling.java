package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {10,20,30};
int r=0;


try
{
	//System.out.println(a[3]);
	r=5/0;
}

catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("Index out of Bounds Exception occured");
}

catch(Exception e)
{
	System.out.println("Other Exception");
	e.printStackTrace();
}
finally
{
	System.out.println(" Final block");
}
System.out.println("After Exception");

	}

}
