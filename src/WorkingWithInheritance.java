
public class WorkingWithInheritance {

	public static void main(String[] args) {
		
		
		// (1) access fields and methods using the object's own type
		HRExecutive hr = new HRExecutive();
		hr.specialization = new String[] { "Staffing" };
		System.out.println(hr.specialization);
		hr.name = "Harry";
		System.out.println(hr.name);
		hr.conductInterview();
		
		// (2) access fields and methods using a reference variable of AnEmployee
		//reference     	object
		AnEmployee emp = new HRExecutive();
		// emp.specialization 		does not work because the reference variable emp cannot access the member "specialization" defined in HRExecutive
		emp.name = "John"; 		// this does work because the reference variable emp has access to the member "name" defined in AnEmployee
		//emp.conductInterview() 	does not work because the reference variable emp cannot access the member "conductInterview()" defined in Interview
		
		//HRExecutive hr2 = new AnEmployee();  does not work because you cannot refer to an object of a base class by using a reference variable of its derived class
		//HRExecutive hr2 = new Interviewer();
		HRExecutive hr2 = (HRExecutive) new AnEmployee();
		hr2.specialization = new String[] { "Organising" };
		System.out.println(hr2.specialization);
		hr2.name = "Harry";
		System.out.println(hr2.name);
		hr2.conductInterview();
		// because of the cast, AnEmployee is now of the type HRExecutive, so it has access to all members that HRExecutive has access to
		
		
		// (3) access fields and methods using the interface reference variable
		//Interviewer inter = new Interviewer(); // does not work because you cannot instantiate an interface
		Interviewer inter = new HRExecutive();
		// inter.specialization = new String[] { "Staffing" }; // does not work because the reference variable inter cannot access the member "specialization" defined in HRExecutive
		//inter.name = "Mona"									//  same reasoning as above
		inter.conductInterview(); // this does work because the reference variable inter has access to the member "conductInterview()" defined in Interview
				
		// it is possible to create an array of the objects that refer to different types of objects by a common base clase or an interface:
		Interviewer[] ints = new Interviewer[1];
		ints[0] = new HRExecutive(); // because HRExecutive implements interface Interviewer, it can be stored here
				
		
	}

}

class AnEmployee {
	String name;
	String address;
	String phoneNumber;
	float experience;
}

interface Interviewer {
	public void conductInterview();
}

class HRExecutive extends AnEmployee implements Interviewer {
	String[] specialization;
	public void conductInterview() {
		System.out.println("HRExecutive conducting interview");
	}
}
