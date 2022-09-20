import java.util.Scanner;
//WAP to accept choice from user and accordingly display the op (Switch case)
//1:Unary Operator
//2:Binary operator
//3:Ternary Operator

public class unaryBinaryTernary {
    public static void main (String args[]){
        int ch;
        //taking input from user to choose which operator they want info on
        System.out.print("\n1. Unary Operator \n2. Binary Operator \n3. Ternary Operator\n");
        System.out.print("Enter your Choice in Number : ");
        Scanner sc= new Scanner(System.in);
        ch=sc.nextInt();
        sc.close();
        //Using switch case to display the op depending on user's choice
        switch (ch) {
            case 1:
                System.out.println("Unary Operator :");
                System.out.println("The operator that acts on a single operand is called unary operator. A unary operator uses a single variable.");
                System.out.print("Some examples of Unary Operator \nUnary Plus :- +(operand) \nUnary Minus :- -(operand) \nIncrement Operator :- ++(operand) \nDecrement Operator :- --(operand)");
                break;
            case 2:
                System.out.println("Binary Operator :");
                System.out.println("The operator that acts on two operands is called binary operator. A binary operator uses two variables.");
                System.out.print("Some examples of Binary Operator \nArithmetic Operator :- +, -, *, /, % \nRelational Operator :- <, <=, >, >=, ==, != \nLogical Operator :- &&, ||, ! \nBitwise Operator :- &, |, <<, >>, ~, ^ \nAssignment Operator :- =, +=, -=, *=, /=, %=");
                break;
            case 3:
                System.out.println("Ternary Operator :");
                System.out.println("The operator that acts on three operands is called ternary operator. A ternary operator uses three variables.");
                System.out.print("Some example of Ternary Operator \nTernary or Conditional operator :- ?:");
                break;
        
            default:
                System.out.println("Enter Valid Choice");
                break;
        }
    }
}
