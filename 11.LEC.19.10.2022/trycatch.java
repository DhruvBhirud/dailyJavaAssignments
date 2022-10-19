import java.util.Scanner;

public class trycatch {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		trycatch obj = new trycatch();
		System.out.println("1. Try Catch\n2. Try Catch Finally\n3. Nested Try Catch\n4. Multiple Catch");
		Scanner sc = new Scanner(System.in);
		ch=sc.nextInt();
		switch (ch) {
		case 1:
			obj.TC();
			break;
		case 2:
			obj.TCF();
			break;
		case 3:
			obj.NTC();
			break;
		case 4:
			obj.MCB();
			break;
		default:
			System.out.println("Enter Valid Option");
			break;
		}
	}
	//arithmetic operation
	public void TC() {
		try {
			int num1,num2,res;
			System.out.println("Enter Two Numbers");
			num1=sc.nextInt();
			num2=sc.nextInt();
			System.out.println("Addition is "+(num1+num2));
			System.out.println("Div is "+(num1/num2));
			System.out.println("Product is "+(num1*num2));
		} catch (ArithmeticException e) {
			System.out.println("The number cannot be divided by Zero");
		}
	}
	//accept the size and than accept no arr[size+1]=45;
	public void TCF() {
		try {
			int num1,num2,res;
			System.out.println("Enter Two Numbers");
			num1=sc.nextInt();
			num2=sc.nextInt();
			System.out.println("Addition is "+(num1+num2));
			System.out.println("Div is "+(num1/num2));
			System.out.println("Product is "+(num1*num2));
		} catch (ArithmeticException e) {
			System.out.println("The number cannot be divided by Zero");
			
		} finally {
			System.out.println("This is Finally Block");
			
		}
	}
	//arithmetic, array, accept name from user than display the name, assign null value to name. display the hashcode
	public void NTC() {
		try
		{
			int num1,num2,res;
			System.out.println("Enter Two Numbers");
			num1=sc.nextInt();
			num2=sc.nextInt();
			System.out.println("Addition is "+(num1+num2));
			System.out.println("Div is "+(num1/num2));
			System.out.println("Product is "+(num1*num2));
			
			try
			{
				String name;
				System.out.println("Enter name :");
				name=sc.next();
				name=null;
				System.out.println("the name is="+name.hashCode());
			}
			catch(NullPointerException n)
			{
				System.out.println("The name cannot be null");
			}
			
			try {
				int[] arr=new int[10];
				arr[99]=123;
				for(int i=0;i<10;i++)
				{
					System.out.println("array="+arr[i]);
				}
			}
			catch (Exception e) {
				System.out.println("Array Size more that specified");
			}
		}
		
		catch(Exception e)
		{
			System.out.println("The number cannot be divided by Zero");
		}
		finally
		{
			System.out.println("This is Finally Block");
		}
		
	}
	//arithmetic, array, accept name from user than display the name, assign null value to name. display the hashcode
	public void MCB() {
		try {
			int num1,num2,res;
			System.out.println("Enter Two Numbers");
			num1=sc.nextInt();
			num2=sc.nextInt();
			System.out.println("Addition is "+(num1+num2));
			System.out.println("Div is "+(num1/num2));
			System.out.println("Product is "+(num1*num2));
			
			String name;
			System.out.println("Enter name :");
			name=sc.next();
			name=null;
			System.out.println("the name is="+name.hashCode());
			
			int[] arr=new int[10];
			arr[99]=123;
			for(int i=0;i<10;i++)
			{
				System.out.println("array="+arr[i]);
			}
		} 
		catch (ArithmeticException e) {
			System.out.println("The number cannot be divided by Zero");
		}
		catch (NullPointerException e) {
			System.out.println("The name cannot be null");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Size more that specified");
		}
		finally {
			
		}
		
	}

}
