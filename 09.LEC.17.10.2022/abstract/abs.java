import java.util.Scanner;

public abstract class abs {
	public static void calc() {
		double net_salary,pf,pt,Gross,incometax;
		Scanner scan=new Scanner(System.in);
		//Taking input from user Gross,Tax,PF and PT
		System.out.println("Enter Gross Salary Of Employee: ");
		Gross=scan.nextFloat();
		System.out.println("Enter Income Tax: "); 
		incometax=scan.nextFloat();
		System.out.println("Enter Basic PF: ");
		pf=scan.nextFloat();
		System.out.println("Enter Professional Tax: ");
		pt=scan.nextFloat();
		//Calculating Net Salary
		net_salary=Gross-(incometax+pf+pt);
		//Display Net Salary
		System.out.println("The Net Salary of Employee is: "+net_salary);
	}
}
