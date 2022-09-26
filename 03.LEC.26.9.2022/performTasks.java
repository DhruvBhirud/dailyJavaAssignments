import java.util.*;

/*WAP to Accept a no from the user and perform the following tasks
  1: Logical Operator
  2: Arithmetic Operation
  3: Reverse of the Number
  4: Swapping of two no with third variable
  5: Swapping without third variable
  6: Accept the value find out the factorial and pass the value of factorial to another function 7
  7: Find out the sum of digit*/

public class performTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("1: Logical Operator\n"
				+ "2: Arithmetic Operation\n"
				+ "3: Reverse of the Number\n"
				+ "4: Swapping of two no with third variable\n"
				+ "5: Swapping without third variable\n"
				+ "6: Accept the value find out the factorial and pass the value of factorial to another function\n"
				+ "7: Find out the sum of digit");
		ch=sc.nextInt();
		switch (ch) {
		case 1:
			logic();
			
			break;
		case 2:
			arith();
			
			break;
		case 3:
			rev();
			
			break;
		case 4:
			swapv();
			
			break;
		case 5:
			swapnv();
			
			break;
		case 6:
			fact();
			char ans;
			System.out.println("Want to find sum of all digits of Factorial? y/n?");
			//Scanner sc = new Scanner(System.in);
			ans=sc.next().charAt(0);
			if (ans=='n') {
				break;
			}
		case 0:
			factsumdigit();
			
			break;
		case 7:
			sumdigit();
			
			break;

		default:
			System.out.println("Enter Valid Option");
			break;
		}
		
	}
//	Logical Operator
	public static void logic() {
		int a=1,b=2,choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Logical AND"
				+ "2. Logical OR"
				+ "3. Logical Not");
		choice=sc.nextInt();
		switch (choice) {
		case 1:
			//Logical AND
			System.out.println("True && False = " + ((a>b) && (a<b)));
			break;
		case 2:
			//Logical OR
			System.out.println("True || False = " + ((a>b) | (a<b)) );
			break;
		case 3:
			//Logical Not
			System.out.println("!(True && False) = " + !((a>b) && (a<b)));
			break;

		default:
			System.out.println("Enter Valid Option");
			break;
		}
	}
//	Arithmetic Operation
	public static void arith() {
		int a,b,choice,r;
		System.out.println("Enter the Numbers a and b : ");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("1: Add\n"
				+ "2: Subtract\n"
				+ "3: Multiply\n"
				+ "4: Divide\n"
				+ "5: Remainder\n");
		choice=sc.nextInt();
		switch (choice) {
		case 1:
			int sum;
			sum=a+b;
			System.out.println("Addition is "+sum);
			break;
		case 2:
			int sub;
			sub=a-b;
			System.out.println("Subtraction is "+sub);
			
			break;
		case 3:
			int mult;
			mult=a*b;
			System.out.println("Multiplication is "+mult);
			
			break;
		case 4:
			int div;
			div=a/b;
			System.out.println("Division is "+div);
			
			break;
		case 5:
			int rem;
			rem=a%b;
			System.out.println("Remainder is "+rem);
			
			break;

		default:
			System.out.println("Enter Valid Option");
			break;
		}
		
		
	}
//	Reverse of the Number
	public static void rev() {
		int num,revnum=0,rem;
		//Getting input from user
		System.out.println("Enter the Number : ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		//Initializing Original number
		int orinum=num;
		//Using while loop to reverse the number
		while(num != 0) {
			rem=num%10;
			revnum=revnum*10+rem;
			num /= 10;
		}
		System.out.println("Reverse of "+orinum+" is "+revnum);
		
	}
//	Swapping of two no with third variable
	public static void swapv() {
		// a and b are to swap
		int a, b, temp;   
	    Scanner sc = new Scanner(System.in);  
	    System.out.println("Enter the value of a and b");  
	    a = sc.nextInt();  
	    b = sc.nextInt();  
	    System.out.println("Before swapping numbers: a="+a +" b="+ b);  
	    /*swapping */  
	    temp = a;  
	    a = b;  
	    b = temp;  
	    System.out.println("After swapping: a="+a +" b=" + b);
		
	}
//	Swapping without third variable
	public static void swapnv() {
		// a and b are to swap
		int a, b, temp;   
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the value of a and b");  
		a = sc.nextInt();  
		b = sc.nextInt();  
		System.out.println("Before swapping numbers: a="+a +" b="+ b);  
		/*swapping */  
		a = a + b;  
		b = a - b;  
		a = a - b;  
		System.out.println("After swapping: a="+a +" b=" + b);
		
	}
//	Accept the value find out the factorial and pass the value of factorial to another function
	public static int fact() {
		int i,factorial=1,num;
		System.out.println("Enter the Number :");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		//using for loop to find factorial of number
		for(i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		System.out.println("Factorial of "+num+" is: "+factorial);
		return factorial;
	}
//	Find out the sum of digit
	public static void factsumdigit() {
		int fact, digit, sum = 0;
		fact=fact();
//		Scanner sc = new Scanner(System.in);  
//		System.out.print("Enter the number: ");  
//		fact = sc.nextInt();
		//using while loop to find sum of digits of number
		while(fact > 0)  
		{  
		//finds the last digit of the given number    
		digit = fact % 10;  
		//adds last digit to the variable sum  
		sum = sum + digit;  
		//removes the last digit from the number  
		fact = fact / 10;  
		}  
		//prints the result  
		System.out.println("Sum of Digits: "+sum);
	}
	public static void sumdigit() {
		int number, digit, sum = 0;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		number = sc.nextInt();
		//using while loop to find sum of digits of number
		while(number > 0)  
		{  
		//finds the last digit of the given number    
		digit = number % 10;  
		//adds last digit to the variable sum  
		sum = sum + digit;  
		//removes the last digit from the number  
		number = number / 10;  
		}  
		//prints the result  
		System.out.println("Sum of Digits: "+sum);
	}

}
