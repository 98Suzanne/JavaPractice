
public class ReturnExercise {

	public static void main(String[] args) {
		
		Phone p = new Phone();
		p.setWeight(20);
		// double newWeight = p.setWeight(20.0); // can't assign to new variable because setWeight does not have a return type
		
		double newWeight = p.getWeight(); // can assign because getWeight does have a return type
		// int newWeight1 = p.getWeight(); // can't assign because the return type is double and not int 
		int newWeight2 = (int)p.getWeight(); // you can however cast a double to an int 
		
		Employee e1 = new Employee();
		e1.printEmp();
		Employee e2 = new Employee();
		e2.age = 33;
		e2.name = "John";
		e2.printEmp(); 
		
	}

}
