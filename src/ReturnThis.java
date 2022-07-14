
public class ReturnThis {
	
	ReturnThis getReturnThis() {
		return this;
	}

	void msg() {
		System.out.println("Hello java");
	}

	public static void main(String args[]) {
		
		ReturnThis test = new ReturnThis();
		test.getReturnThis().msg();
	}
}
