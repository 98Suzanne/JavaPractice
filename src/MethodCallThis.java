
public class MethodCallThis {

	void m(MethodCallThis obj) {
		System.out.println("Method is invoked");
	}
	
	void p() {
		m(this);
	}
		
	public static void main(String[] args) {

		MethodCallThis a = new MethodCallThis();
		a.p();

	}

}
