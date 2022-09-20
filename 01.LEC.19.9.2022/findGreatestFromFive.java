import java.util.Scanner;

//WAP to accept 5 no from user and find out the greatest
public class findGreatestFromFive {
    public static void main (String args[]){
        int a,b,c,d,e;
        //Taking input from user
        System.out.println("Enter 5 Numbers");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        sc.close();
        //using if else if ladder to check which number is greater
        if ((a>b)&&(a>=c)&&(a>=d)&&(a>=e)) {
            System.out.println("The Greatest number is : "+a);
        }
        else if ((b>=c)&&(b>=d)&&(b>=e)) {
            System.out.println("The Greatest number is : "+b);
        }
        else if ((c>=d)&&(c>=e)) {
            System.out.println("The Greatest number is : "+c);
        }
        else if ((d>=e)) {
            System.out.println("The Greatest number is : "+d);
        }
        else{
            System.out.println("The Greatest number is : "+e);
        }
    }
}
