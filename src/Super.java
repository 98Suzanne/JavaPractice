
public class Super {

	public static void main(String[] args) {

		Dog d = new Dog(); //1
		d.printColor();

		Dog2 d2 = new Dog2(); //2
		d2.work();

		Dog3 d3 = new Dog3(); //3
		
		Dog4 d4 = new Dog4(); //4

	}

}

//1 to refer immediate parent class instance variable
class Animal {
	String color = "white";
}

class Dog extends Animal {
	String color = "black";

	void printColor() {
		System.out.println(color);// prints color of Dog class
		System.out.println(super.color);// prints color of Animal class
	}
}

//2 to invoke parent class method
class Animal2 {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog2 extends Animal2 {
	void eat() {
		System.out.println("eating bread...");
	}

	void bark() {
		System.out.println("barking...");
	}

	void work() {
		super.eat();
		bark();
	}
}


//3 to invoke parent class constructor
class Animal3 {
	Animal3() {
		System.out.println("animal is created");
	}
}

class Dog3 extends Animal3 {
	Dog3() {
		super();
		System.out.println("dog is created");
	}
}


//4 super() is added implicitly to every constructor!!
class Animal4 {
	Animal4() {
		System.out.println("animal is created");
	}
}

class Dog4 extends Animal4 {
	Dog4() {
		System.out.println("dog is created");
	}
}