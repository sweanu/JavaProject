package oops;

public class Employee {

	public String namee;
	public int empid;
	private static int salary=1000;
	
	public Employee()
	{
		System.out.println("default");
	}
	
	public Employee(String name,int num)
	{
		System.out.println("parameters");
		this.namee=name;
		this.empid=num;
	}
	
	public void Displayname()
	{
		System.out.println("name of the employee : "+namee);
		System.out.println("employee id : "+empid);
	}
	
	public static void Disaplaysalary()
	{
		System.out.println("salary to all employees : "+salary);
	}
}
