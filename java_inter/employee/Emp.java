package employee;

class abc
{
	String name,category;
	int eid;
	Double b_pay,HRA,DA,n_pay,p_fund,g_pay,i_tax,allowance; 
	public abc(String name,int eid,String category,Double b_pay)
	{
		this.name=name;
		this.eid=eid;
		this.category=category;
		this.b_pay=b_pay;
	}
	public void cal()
	{
			HRA=0.10*b_pay;
			DA=0.05*b_pay;
			allowance=0.20*b_pay;
			g_pay=HRA+DA+allowance+b_pay;
			p_fund=0.10*g_pay;
			i_tax=0.05*g_pay;
			n_pay=g_pay-(p_fund+i_tax);
	}
	public void dis()
	{
		System.out.println("Employee Name :: "+name);
		System.out.println("Employee Category :: "+category);
		System.out.println("Employee ID :: "+eid);
		System.out.println("Employee Basic pay :: "+b_pay);
		System.out.println("Employee HRA :: "+HRA);
		System.out.println("Employee DA :: "+DA);
		System.out.println("Employee Allowance :: "+allowance);
		System.out.println("Employee Gross Pay :: "+g_pay);
		System.out.println("Employee Provident Fund :: "+p_fund);
		System.out.println("Employee Income Tax :: "+i_tax);
		System.out.println("Employee Net Pay  :: "+n_pay);
	}
}
public class Emp {
	public static void main(String args[]) {
		abc e=new abc("pranav",1,"manager",5000.00);
		e.cal();
		e.dis();
	}
}
