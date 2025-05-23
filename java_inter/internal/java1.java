package internal;
class Employee
{
	String name, dob;int id;
	public Employee(String name,String dob,int id) {
		this.name=name;
		this.dob=dob;
		this.id=id;
	}
	void display()
	{
		System.out.println("Employee Name :: "+name);
		System.out.println("Employee Date of birth :: "+dob);
		System.out.println("Employee ID :: "+id);
	}
}
class Manager extends Employee
{
	
	Double salary;
	public Manager(String name,String dob,int id,Double salary) {
		super(name,dob,id);
		this.salary=salary;
	}
	void display()
	{
		super.display();
		System.out.println("Manager salary :: "+salary);
	}
}
class Sales_Manager extends Manager
{
	
	Double commission;
	public Sales_Manager(String name,String dob,int id,Double salary,Double commission) {
		super(name,dob,id,salary);	
		this.commission=commission;
	}
	void display()
	{
		super.display();
		System.out.println("Sales Manager commission :: "+commission);
	}
}
public class java1 {
	public static void main(String args[]) {
		Sales_Manager emp=new Sales_Manager("Pranav","1-2-2025",1,5000.00,600.00);
		emp.display();
	}
}
