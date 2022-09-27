import java.util.Scanner;

/*WAP using array accept the size from the user than accordingly
accept the no from the user and find out
the greater no,smaller no, ascending, Descending*/

public class arraySortFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		arraySortFromUser obj = new arraySortFromUser();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Find Greater\n"
				+ "2. Find Smaller\n"
				+ "3. Ascending\n"
				+ "4. Descending\n");
		ch=sc.nextInt();
		switch (ch) {
		case 1:
			obj.greater();
			break;
		case 2:
			obj.smaller();
			break;
		case 3:
			obj.asc();
			break;
		case 4:
			obj.desc();
			break;

		default:
			break;
		}
	}
	public int[] accept() {
		Scanner sc = new Scanner(System.in);
		int size,i;
		System.out.println("Enter size");
		size=sc.nextInt();
		int no[]=new int[size];
		System.out.println("Enter "+size+" numbers:");
		for(i=0;i<size;i++) {
			no[i]=sc.nextInt();
		}
		return no;
	}
	public void greater() {
		int i;
		int[] arr = accept();
		int max=arr[0];
		for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
		System.out.println("Greatest number in the given array is " +max);
	}
	public void smaller() {
		int i;
		int[] arr=accept();
		int min=arr[0];
		for (i = 0; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];
		System.out.println("Minumum number in the given array is " +min);
				
	}
	public void asc() {
		
		 int temp = 0;    
		 int[] arr=accept();
	     //Displaying elements of original array    
	     System.out.println("Elements of original array: ");    
	     for (int i = 0; i < arr.length; i++) {     
	         System.out.print(arr[i] + " ");    
	     }    
	            
	     //Sort the array in ascending order    
	     for (int i = 0; i < arr.length; i++) {     
	         for (int j = i+1; j < arr.length; j++) {     
	            if(arr[i] > arr[j]) {    
	                temp = arr[i];    
	                arr[i] = arr[j];    
	                arr[j] = temp;    
	            }     
	         }     
	     }    
	          
	     System.out.println();    
	            
	     //Displaying elements of array after sorting    
	     System.out.println("Elements of array sorted in ascending order: ");    
	     for (int i = 0; i < arr.length; i++) {     
	         System.out.print(arr[i] + " ");    
	     }
	}
	public void desc() {
		
		 int temp = 0;    
		 int[] arr=accept();
	     //Displaying elements of original array    
	     System.out.println("Elements of original array: ");    
	     for (int i = 0; i < arr.length; i++) {     
	         System.out.print(arr[i] + " ");    
	     }    
	            
	     //Sort the array in ascending order    
	     for (int i = 0; i < arr.length; i++) {     
	         for (int j = i+1; j < arr.length; j++) {     
	            if(arr[i] < arr[j]) {    
	                temp = arr[i];    
	                arr[i] = arr[j];    
	                arr[j] = temp;    
	            }     
	         }     
	     }    
	          
	     System.out.println();    
	            
	     //Displaying elements of array after sorting    
	     System.out.println("Elements of array sorted in descending order: ");    
	     for (int i = 0; i < arr.length; i++) {     
	         System.out.print(arr[i] + " ");    
	     }
	}

}
