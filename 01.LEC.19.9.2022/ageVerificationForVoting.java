import java.util.Scanner;

public class ageVerificationForVoting {
    public static void main (String args[]){
        int age;
        System.out.println("Enter age of user");
        Scanner sc = new Scanner(System.in);
        age=sc.nextInt();
        sc.close();
        if (age>=18) {
            System.out.println("The user is eligible for voting");
        } else {
            System.out.println("The user is not eligible for voting");
        }
    }
}
