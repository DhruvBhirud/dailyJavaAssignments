package modifiers;

public class priv1 extends priv {
	public static void main(String[] args) {
		priv obj=new priv();
		//compile error cause private methods cannot be accessed outside the class
		obj.display();
	}
}
