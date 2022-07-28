package Loops;

public class Labelled {

	public static void main(String[] args) {

		JACK: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("i = " + i + " j = " + j);
				if (i + j > 10)
					break JACK;
			}
			System.out.println("hello");
		}
	}

}
