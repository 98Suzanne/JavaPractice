import java.util.Scanner;

public class Palindrome {
	
	public boolean isPalindrome() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = input.nextInt();
		
		String str = String.valueOf(num);
		int i = 0;
		int j = str.length() -1;
		
		while (i < j) {
			if (str.charAt(i++) != str.charAt(j--)) {
				return false;
			}
		}
		return true;
	}

}
