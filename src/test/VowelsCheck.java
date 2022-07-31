package test;

public class VowelsCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Welcome to Automation program";

String sl=s.toLowerCase();
int temp=0;
int count=0;

for(int i=0; i<sl.length();i++)
{
	temp=sl.charAt(i);
	switch (temp)
	{
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		count++;
		break;
	}
}
System.out.println(count);
	}

}
