
public class bitwise extends accept {

	// public static void main(String[] args) {
	// 	// TODO Auto-generated method stub
	// 	bitwise obj = new bitwise();
	// 	obj.bit();
	// }
	public void bit() {
		acpt();
		//Bit wise unary not
		System.out.println("~ : Bit wise unary not of ~"+num1+" is "+(~num1));
		System.out.println("~ : Bit wise unary not of ~"+num2+" is "+(~num2));
		//Bit wise And
		System.out.println("& : Bit wise And = " +(num1&num2));
		//Bit wise OR
		System.out.println("| : Bit wise OR) = " +(num1|num2));
		//Bit wise Exclusive OR
		System.out.println("^ : Bit wise Exclusive OR) = " +(num1^num2));
	}

}
