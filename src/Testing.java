
public class Testing {

	public static void main(String[] args) {
		
		//reference			/object (aka class instance)
		AnInterviewer m = new Manager();
		m.submitInterviewStatus();
	}

}

class Manager implements AnInterviewer {
	public String print() {
		return("I am " + this);
	}
	
}

interface AnInterviewer {
	int MIN_SAL = 9999;
	default void submitInterviewStatus() {
		System.out.println(this);	// refers to the object's own instance, so Manager
		System.out.println(this.MIN_SAL); // // refers to the object's own instance, so Manager, which implements AnInterviewer, so it can access MIN_SAL in AnInterviewer
		System.out.println(this.print()); // refers to the object's own instance, so Manager
	}
	String print();
	
}

