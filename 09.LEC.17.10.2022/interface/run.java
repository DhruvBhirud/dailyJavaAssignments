import java.util.*;

public class run implements info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run obj=new run();
		obj.emp_basic_info();
		obj.emp_info();
	}

	@Override
	public void emp_basic_info() {
		// TODO Auto-generated method stub
		String name,email,address,dob,phone;
		Scanner sc = new Scanner(System.in);
		//taking user input
		System.out.println("Enter Employee's Name");
		name=sc.next();
		System.out.println("Enter Email :");
		email=sc.next();
		System.out.println("Enter Address :");
		address=sc.next();
		System.out.println("Enter Date of Birth :");
		dob=sc.next();
		System.out.println("Enter Phone Number :");
		phone=sc.next();
		//displaying the basic details
		System.out.println("Employee's Name : "+name);
		System.out.println("Email : "+email);
		System.out.println("Address : "+address);
		System.out.println("Date of Birth : "+dob);
		System.out.println("Phone Number : "+phone);
	}
	
	@Override
	public void emp_info() {
		// TODO Auto-generated method stub
		String emp_id,department,designation,location,salary;
		Scanner sc = new Scanner(System.in);
		//taking user input
		System.out.println("Enter Employee's ID : ");
		emp_id=sc.next();
		System.out.println("Enter Department : ");
		department=sc.next();
		System.out.println("Enter Designation : ");
		designation=sc.next();
		System.out.println("Enter Location : ");
		location=sc.next();
		System.out.println("Enter Salary : ");
		salary=sc.next();
		//Displaying employee details
		System.out.println("Employee's ID : "+emp_id);
		System.out.println("Department : "+department);
		System.out.println("Designation : "+designation);
		System.out.println("Location : "+location);
		System.out.println("Salary : "+salary);
	}

}
