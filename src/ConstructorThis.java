public class ConstructorThis {
	ConstructorThis() {
		System.out.println("hello a");
	}

	ConstructorThis(int x) {
		this(); //this is used to refer to another constructor in the same class, in this case ConstructorThis
				// 
		System.out.println(x);
	}
	
	public static void main(String args[]) {
		ConstructorThis a = new ConstructorThis(10);
	}
}