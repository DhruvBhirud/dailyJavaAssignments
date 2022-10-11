import java.util.Scanner;
//Inheriting the fib class in greater class
public class greater extends fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		//taking user input
		System.out.println("Enter the two numbers");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		if (n1>n2) {
			System.out.println(n1+" is the greatest number");
		}
		else {
			System.out.println(n2+" is the greatest number");
		}
		//Calling fibo function from fib class
		fibo();
	}

}
