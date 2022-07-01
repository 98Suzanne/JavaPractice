import java.util.Scanner;

public class Sum {

	public int sumValues() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int n1 = input.nextInt();
		int sum = 0;
		while (n1 != 0) {
			sum += n1 % 10;
			n1 /= 10;
		}
		return sum;
	}

}