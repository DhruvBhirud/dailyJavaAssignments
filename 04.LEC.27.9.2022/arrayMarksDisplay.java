import java.util.*;

/*WAP to accept Student's Name, Marks of 5 subject, Calculate the Percentage and display the grade*/
public class arrayMarksDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Taking input from user 
        Scanner sc = new Scanner(System.in); 
        int n;
        String name;
        //Ask the user to enter the Array Size
        System.out.println("Enter the name of student ");
        name=sc.next();
        
        //Ask the user to enter the Array Size
        System.out.println("Enter the total subjects ");
        n=sc.nextInt();
        
        //Declare the array
        int arr[] = new int[n]; 
        System.out.println("Enter the marks secured in each subject by "+name+" out of 100");
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
        System.out.println("The total marks obtained is "+total);
        
        //Calculate the percentage
        float percentage; 
        percentage = (total / (float)n); 
        
        //Display the total percentage
        System.out.println( "Total Percentage : " + percentage + "%");
        String grade;
        if(percentage>=94)
        	grade="A";
         else if(percentage>=90 && percentage<94)
        	 grade="A-";
         else if(percentage>=87 && percentage<90)
        	 grade="B+";
         else if(percentage>=83 && percentage<87)
        	 grade="B";
         else if(percentage>=80 && percentage<83)
        	 grade="B-";
         else if(percentage>=77 && percentage<80)
        	 grade="C+";
         else if(percentage>=73 && percentage<77)
        	 grade="C";
         else if(percentage>=70 && percentage<73)
        	 grade="C-";
         else if(percentage>=67 && percentage<70)
        	 grade="D+";
         else if(percentage>=63 && percentage<67)
        	 grade="D";
         else if(percentage>=60 && percentage<63)
        	 grade="D-";
         else
        	 grade="F";
        System.out.println("The Grades of "+name+" is "+grade);
	}

}
