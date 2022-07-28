
public class Exc {

	public static void main(String[] args) {
		try {
			test("          ");

			System.out.println("1");
		} catch (MijnException e) {
			System.out.println("2");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("3");
			e.printStackTrace();
		}
	}
	
	public static int test(String a) throws MijnException {
		if (a == null || a.length() <= 2)
			throw new MijnException();

		try {
			return test2(a);
		} catch (Mijn2Exception e) {
			throw new MijnException(e.getMessage(), e);
		}
	}
	
	public static int test2(String a) throws Mijn2Exception {
		if (a == null || a.length() <= 4)
			throw new Mijn2Exception();

		return 6;
	}

}

class MijnException extends Exception {
	public MijnException() {
		
	}
	
	public MijnException(String message, Throwable cause) {
		super(message, cause);
	}
}

class Mijn2Exception extends Exception {
	
}


