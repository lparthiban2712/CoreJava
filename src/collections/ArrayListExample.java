package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> listobj= new ArrayList<String>();
listobj.add("Parthi");
listobj.add("Priya");
System.out.println(listobj);
System.out.println(listobj.size());
listobj.remove(1);
System.out.println(listobj);
System.out.println(listobj.size());
listobj.add("Dev");
listobj.add("Hem");
System.out.println(listobj.get(2));
listobj.set(0, "Apple");
System.out.println(listobj);
listobj.add(1, "Priya");
System.out.println(listobj);
listobj.set(0, "Parthi");
System.out.println(listobj);
//System.out.print(Collections.sort(listobj));
Collections.sort(listobj);
System.out.println(listobj);

for(String name:listobj)
{
	System.out.println(name);
}

Collections.reverse(listobj);
System.out.println(listobj);
listobj.add("Priyanka");
	
	
	for(int i=0;i<listobj.size();i++)
	{
	String name=listobj.get(i);
	
	if(name.equalsIgnoreCase("Priyanka"))
	{
		System.out.println(i);
		break;
	}
	}
	
	LinkedList<String> ob=new LinkedList<String>();
	ob.add("Year");
	ob.add("month");
	ob.add("day");
	System.out.println(ob);
	System.out.println(ob.size());
	
	}

}
