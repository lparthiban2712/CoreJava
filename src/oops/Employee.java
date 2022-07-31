package oops;

public class Employee {
	
	public String name;
	public int id;
	public String dept;
	
	public Employee()
	{
		System.out.println("Default constructor");
	}
	
	public Employee(String name, int age, String dept)
	{
		this.name=name;
		this.id=age;
		this.dept=dept;
	}
	
	public void display()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(dept);
	}

}
