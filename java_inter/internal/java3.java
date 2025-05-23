package internal;
import java.io.*;
class abc
{
	public void  accept()
	{
		int rollno,marks;
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter roll no::");
			rollno=Integer.parseInt(br.readLine());
			
			System.out.println("Enter Marks ::");
			marks=Integer.parseInt(br.readLine());
			
			if (marks<0 || marks>100) {
				throw new ArithmeticException("Marks must be grater than 0 and less than 100");
			}
			else
			{
				System.out.println("Your Roll no "+rollno);
				System.out.println("Your marks "+marks);
			}
		}catch(ArithmeticException e) {
			System.out.println("Exception caught : "+e.getMessage());
		}catch(IOException e) {
			System.out.println("Exception Error : "+e.getMessage());
		}
	}
}
public class java3 {
	public static void main(String args[]) {
		abc x=new abc();
		x.accept();		
		}
}
