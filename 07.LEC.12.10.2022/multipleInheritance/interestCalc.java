import java.text.DecimalFormat;
import java.util.*;

public class interestCalc implements bankofindia,bankofmaharashtra,hdfc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		interestCalc obj = new interestCalc();
		Scanner sc = new Scanner(System.in);
		System.out.println("Select which bank you want to check Interest for :");
		System.out.println("1 Bank of Maharashtra\n2 Bank of India\n3 HDFC");
		ch=sc.nextInt();
		switch (ch) {
		case 1:
			obj.bom();
			break;
		case 2:
			obj.boi();
			break;
		case 3:
			obj.hdf();
			break;

		default:
			System.out.println("Submit Valid Input");
			break;
		}
	}

	@Override
	public void boi() {
		// TODO Auto-generated method stub
		float p, t;
		double sinterest;
		double r=6.05;
		DecimalFormat f = new DecimalFormat("##.##");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = sc.nextFloat();
        System.out.print("Enter the Time period : ");
        t = sc.nextFloat();
        System.out.println("Rate of Interest of Bank of India is "+r);
        sinterest = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +f.format(sinterest));
	}

	@Override
	public void bom() {
		// TODO Auto-generated method stub
		float p, t;
		double sinterest;
		double r=8.7;
		DecimalFormat f = new DecimalFormat("##.##");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = sc.nextFloat();
        System.out.print("Enter the Time period : ");
        t = sc.nextFloat();
        System.out.println("Rate of Interest of Bank of Maharashtra is "+r);
        sinterest = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +f.format(sinterest));
	}
	
	@Override
	public void hdf() {
		// TODO Auto-generated method stub
		float p, t;
		double sinterest;
		double r=5.5;
		DecimalFormat f = new DecimalFormat("##.##");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = sc.nextFloat();
        System.out.print("Enter the Time period : ");
        t = sc.nextFloat();
        System.out.println("Rate of Interest of HDFC is "+r);
        sinterest = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +f.format(sinterest));
	}


}
