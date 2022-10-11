import java.util.Scanner;

public class prime {
	public static void pr() {
		int count=0;
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		//taking user input
		System.out.println("Enter Two Values");
		num1=sc.nextInt();
		num2=sc.nextInt();
		for(int i=2; i<num1; i++)
	      {
	    	 //if condition
	         if(num1%i == 0)
	         {
	            count++;
	            break;
	         }
	      }
	      //if else to print if prime or not
	      if(count==0)
	         System.out.println(+num1+" is a Prime Number.");
	      else
	         System.out.println(+num1+" is not a Prime Number.");
	      for(int i=2; i<num2; i++)
	      {
	    	 //if condition
	         if(num2%i == 0)
	         {
	            count++;
	            break;
	         }
	      }
	      //if else to print if prime or not
	      if(count==0)
	         System.out.println(+num2+" is a Prime Number.");
	      else
	         System.out.println(+num2+" is not a Prime Number.");
	      }
	}


