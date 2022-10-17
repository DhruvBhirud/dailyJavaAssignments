import java.util.Scanner;

public class run extends abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String emp_id,department,designation,location,salary;
		Scanner sc = new Scanner(System.in);
		//Taking user input for employee info
		System.out.println("Enter Employee's ID : ");
		emp_id=sc.next();
		System.out.println("Enter Department : ");
		department=sc.next();
		System.out.println("Enter Designation : ");
		designation=sc.next();
		System.out.println("Enter Location : ");
		location=sc.next();
		//calling calc from abs to get net salary
		calc();
		//display employee info along with calculated net salary from abs
		System.out.println("Employee's ID : "+emp_id);
		System.out.println("Department : "+department);
		System.out.println("Designation : "+designation);
		System.out.println("Location : "+location);
	}

}
