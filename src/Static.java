
public class Static {

	public static void main(String[] args) {
		
		Jaguar j = new Jaguar();
		j.Walking(); // if Walking was not static
		Jaguar.Walking(); // access static method through ClassName.MethodName
		j.age = 13;
		System.out.println(Jaguar.age);
		Jaguar.age = 15;
		System.out.println(Jaguar.age);
		System.out.println(Jaguar.speed);
		// System.out.println(Jaguar.name); // Cannot make a static reference to the non-static field Jaguar.name, i.e. cannot access non-static variable through ClassName.VariableName 
		System.out.println(j.name); // access a non-static variable through reference variable j


	}
	

}

class Jaguar {
	
	static int age;
	static int speed = 120;
	String name = "Jack";
	
	static void Walking() {
		System.out.println("Jaguar is walking");
	}
	
}