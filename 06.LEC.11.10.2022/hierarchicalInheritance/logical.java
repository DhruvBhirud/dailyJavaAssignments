
public class logical extends accept {

	// public static void main(String[] args) {
	// 	// TODO Auto-generated method stub
	// 	logical obj = new logical();
	// 	obj.logic();
	// }
	public void logic() {
		acpt();
		//Logical And
		System.out.println("True && False = " + ((num1>num2) && (num1<num2)));
		//Logical OR
		System.out.println("True || False = " + ((num1>num2) | (num1<num2)));
		//Logical Not
		System.out.println("!(True && False) = " + !((num1>num2) && (num1<num2)));
	}

}
