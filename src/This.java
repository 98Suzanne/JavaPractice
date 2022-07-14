
public class This {
	
	public void m() {
		System.out.println("we are in m");
	}
	
	public void n() {
		System.out.println("we are in n");
		this.m();
		m();
	}
	

	public static void main(String[] args) {
		
		This test = new This();
		test.n();
		

	}

}

