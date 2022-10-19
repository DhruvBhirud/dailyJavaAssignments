import java.util.Scanner;

public class findGreaterGC {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//creating object
		findGreaterGC obj=new findGreaterGC();
		//calling method
		obj.greater();
		obj=null;
		//calling gc method to free memory
		System.gc();
		
	}
	
	public void greater()
	{
		int n1,n2;
		//taking user input
		System.out.println("Enter the two numbers");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		//checking which variable is greater
		if (n1>n2) {
			System.out.println(n1+" is the greatest number");
		}
		else {
			System.out.println(n2+" is the greatest number");
		}
	}

}
