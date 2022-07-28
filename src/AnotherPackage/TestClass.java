package AnotherPackage;

public class TestClass {
	
	public static void main(String[] args) {
		
		TestClass test = new TestClass();
		test.myByte = 3; 		// can change because myByte is public
		test.myNumber = 6;		//can change because myNumber is public
		test.isTrue = false; 	// can change because isTrue has default access, meaning you can access it in the same package
		// test.myFloat 		// cannot change the value of myFloat because myFloat is private in "AnotherPackage". Protected means it is not visible outside of the class it is declared in.

	}

	public byte myByte = 2;
	protected int myNumber = 6;
	boolean isTrue = true;
	private float myFloat = 3.2f;
	
}