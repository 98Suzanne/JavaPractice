
public class Phone {
	
	double weight;
	void setWeight (double val) {
		weight = val;
	}
	
	double getWeight() {
		return weight;
	}
	
	void setMoreWeight(double val) {
		return;
		// weight = val; //code is unreachable because of the return statement right before it, the code won't compile
		}
	
	Phone() {
		System.out.println("Hello from constructor");
	}
	}

