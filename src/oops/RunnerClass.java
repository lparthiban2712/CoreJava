package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Employee emp=new Employee();
emp.dept="EEE";
emp.id=27;
emp.name="parthi";

System.out.println(emp.dept+ " " + emp.id+ " "+ emp.name);

Employee emp2=new Employee("Parthi", 27, "EEE");
emp2.display();*/
		
		Bank b=new Bank();
		b.AccountBalance();
		System.out.println(b.GetBalance());
		BOA ba=new BOA();
		Overloadingexample ob= new Overloadingexample();
		System.out.println(ob.getarea(5, 4));
		System.out.println(ob.getarea(5));
		Browser obj= new Chrome();
		Encapsule encap= new Encapsule();
		encap.setName("Parthiban");
		System.out.println(encap.getName());
		
		
	}

}

