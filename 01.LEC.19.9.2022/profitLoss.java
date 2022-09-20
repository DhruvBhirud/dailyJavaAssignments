import java.util.Scanner;

//WAP to accept the SP and CP from the user and find out the profit and loss

public class profitLoss 
{
    public static void main(String args[]){

        int sp,cp,res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Selling Price");
        sp=sc.nextInt();
        System.out.println("Enter the Cost Price");
        cp=sc.nextInt();
        sc.close();
        res = sp-cp;
        if (res>0) {
            System.out.println("The Profit is : "+res);
            
        } 
        else if(res==0){
            System.out.println("The is no Profit or Loss");
        }
        else {
            System.out.println("The Loss is :"+res);
        }

    }

}
