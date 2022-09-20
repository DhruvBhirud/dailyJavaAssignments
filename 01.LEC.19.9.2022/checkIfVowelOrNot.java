import java.util.*;
//WAP to accept character/Alphabet from user and check if it is vowel or not
public class checkIfVowelOrNot {
    public static void main (String args[]){
        char ch;
        //Take input from user
        System.out.println("Enter the Alphabet");
        Scanner sc = new Scanner(System.in);
        ch=sc.next().charAt(0);
        sc.close();
        //Implementing switch case to check if Alphabet is vowel or not
        //Did not break all cases because we have to find on if they are vowel or not
        //Code becomes small using array will be efficient too
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                    System.out.println(ch + " is Vowel");
                break;
        
            default:
            System.out.println(ch + " is not Vowel");
                break;
        }
    }
}
