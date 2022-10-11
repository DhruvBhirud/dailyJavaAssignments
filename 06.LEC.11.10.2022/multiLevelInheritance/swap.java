import java.util.Scanner;

public class swap extends prime{
    public static void swp() {
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
}
