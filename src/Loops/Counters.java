package Loops;

public class Counters {

	public static void main(String[] args) {
		
		int counter= 0;
		for (int i = 0; i < 4; i++) {
			System.out.println("i = " + i);
			
			for (int j = 0; j < 2; j++) {
				if (j == 1)
					break;
				
				System.out.println("j = " + j);
				
				counter++;
			}
			
			counter++;
		}
		
		System.out.println("counter is " + counter);

	}

}
