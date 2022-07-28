import AnotherPackage.*;

public class PackageTest {

	public static void main(String[] args) {
		
		TestClass test = new TestClass();
		test.myByte = 4;		// can change the value of myByte because it is a public variable
		// test.myNumber = 6; 	// cannot change the value of number because number is protected in "AnotherPackage". Protected means it is only visible in the same class or in derived classes the same package.
		// test.isTrue = false; 
		// test.myFloat = 4.3; 	// cannot change the value of myFloat because myFloat is private in "AnotherPackage". Protected means it is not visible outside of the class it is declared in.
		

	}

}
