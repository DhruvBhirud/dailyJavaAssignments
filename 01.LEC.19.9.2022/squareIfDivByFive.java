import java.util.Scanner;

public class squareIfDivByFive {
    public static void main (String args[]){
        int num,res;
        //taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
        //if statement start
        if (num%5==0) {
            res=num*num;
            System.out.println("Square of the number is : "+res);
        }
        //using else to notify user that number is not valid for the operation
        else{
            System.out.println("The number is not divisible by 5");
        }
    }
}
