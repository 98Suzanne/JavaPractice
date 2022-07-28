package Inheritance;

public class ReturnThis {
	
	ReturnThis getReturnThis() {
		return this;
	}

	void msg() {
		System.out.println("Hello java");
	}

	public static void main(String args[]) {
		
		ReturnThis test = new ReturnThis();
		test.msg();
		test.getReturnThis();
		test.getReturnThis().msg();

	}
}
