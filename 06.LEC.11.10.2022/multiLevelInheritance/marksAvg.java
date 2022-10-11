import java.util.Scanner;

public class marksAvg extends swap{

	public static void marks() {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total subjects ");
        n=sc.nextInt();
		System.out.println("Enter Student's Marks");
		int arr[] = new int[n]; 
        System.out.println("Enter the marks secured in each subject");
        for(int i=0;i<n;i++)   //Initialize the array
        {
            arr[i]=sc.nextInt();
        }
        int total=0;
        //Calculate the total marks
        for(int i=0;i<n;i++)
        {
            total=total+arr[i];
        }
        //Display the total marks
        System.out.println("The average of total marks obtained is "+total/n);
	}

}
