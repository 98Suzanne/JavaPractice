
public class Demo {

	public static void main(String[] args) {
		
		Go go = new Bo();
		try {
			System.out.println("wel");
			go.ho();
			System.out.println("soms");
		} catch(Weg w) {
			System.out.println("www");
		}catch (Exception e) {
			System.out.println("pfeww");
		} finally {
			System.out.println("hammertime");
		}
		System.out.println("stop");
	}
	
	

}

class Go{
	Go() {
		System.out.println("So");
	}
	void ho() throws Exception {
		System.out.println("niet");
		throw new Exception();
	}
}

class Bo extends Go{	
	Bo() {
		System.out.println("No");
	}
	void ho() throws Weg {
		System.out.println("oei");
		throw new Weg();
	}
}

class Weg extends Exception { }