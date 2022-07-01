import java.util.Scanner;

public class Easy {

	public static void main(String[] args) {
		
		
		// program that takes two numbers and display the product of two numbers
		Scanner input = new Scanner(System.in);
		System.out.println("First number");
		int n1 = input.nextInt();
		
		System.out.println("Second number");
		int n2 = input.nextInt();
		
		System.out.println("The product is " + n1 * n2);
		
		// program to print the sum, multiply, subtract, divide and remainder of two numbers
		System.out.println("Third number");
		int n3 = input.nextInt();
		
		System.out.println("Fourth number");
		int n4 = input.nextInt();
		
		System.out.println("Fifth number");
		int n5 = input.nextInt();
		
		System.out.println("The average is " + (n1+n2+n3+n4+n5) / 5);
		
		// program to swap two variables
		int num1, num2, temp; // temp is a variable that contains one single element of that array in your loop
		num1 = 5;
		num2 = 6;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("The numbers are num1, num2: "+ num1 + " and " + num2);
		
		
		// program and compute the sum of the digits of an integer
		Sum mySum = new Sum(); // Create an object of Sum
		System.out.println(mySum.sumValues());
		
		// program to count the letters, spaces, numbers and other characters of an input string
		Count myCount = new Count();
		myCount.CountAll("Hello World!");
		
		// program to print the odd numbers from 1 to 20
		Even test = new Even();
		test.isEven();
		
		// program to check if a positive number is a palindrome or not
		
		Palindrome myPalindrome = new Palindrome();
		System.out.println(myPalindrome.isPalindrome());
		
		
		}
}
		