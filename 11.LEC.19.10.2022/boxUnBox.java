import java.util.Scanner;

public class boxUnBox {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box();
		Unbox();
	}
	//+ or - using box
	public static void Box() {
		System.out.println("This is Box Method :\n");
		//taking input as int datatype
		System.out.println("Enter a number");
		int num=sc.nextInt();
		//assigning int num in obj named it1
		Integer it=new Integer(num);
		//check if number is positive or negative
		if(it>0) {
			System.out.println(+it+" is Positive Value");
		}
		else if(it==0) {
			System.out.println(+it+" is Neither Positive Nor Negative Value");
		}
		else {
			System.out.println(+it+" is Negative Value");
		}
	}
	//div by 3 or not using unbox
	public static void Unbox() {
		System.out.println("\nThis is UnBox Method :\n");
		System.out.println("Enter the value");
		//assigning value to obj
		Integer obj=sc.nextInt();
		//assigning obj value in num variable
		int num=obj;
		//checking if number is divisible by 3 or not
		if(num%3==0) {
			System.out.println(+num+" is Divisible by 3");
		}
		else {
			System.out.println(+num+" is Not Divisible by 3");
		}
		
	}

}