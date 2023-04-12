package oops;

public class Runnerclass {

	public static void main(String[] args)
	{
	/*	Employee emp1=new Employee();
		emp1.namee="sweta";
		emp1.empid=10;
		emp1.Displayname();
		/*
		Employee emp2=new Employee();
		emp2.namee="sneha";
		emp2.empid=11;
		emp2.Displayname();
		
		Employee emp3=new Employee("anu",12);
		emp3.Displayname();
		
		Employee.Disaplaysalary();*/
		
		Citizen ct1=new Citizen();
		ct1.name="sweta";
		ct1.age=23;
		ct1.SSN=111;
		ct1.countryname="india";
		ct1.print();
		
		Citizen ct2=new Citizen("radha","tamilnadu",27,112);
		ct2.print();
		
		Insurance in1=new Insurance();
		in1.Insuranceid=113;
		in1.SSN=114;
		in1.print();
		in1.print(555);
		
		Icicibank bank=new Icicibank();
		bank.print();
		
		Encapsulation encap=new Encapsulation();
		encap.setSalary(100);
		
		System.out.println("the salary is:"+ encap.getSalary());
	}
}
