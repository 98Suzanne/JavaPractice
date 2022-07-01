import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		
		// print numbers from 1 to 10 using loop
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		// program to calculate the sum of first 10 natural number using loop
		int sum = 0;
		for (int i=1; i<=10; i++) {
			sum += i;
			
		}
		System.out.println(sum);
			
		// program to print multiplication table of given number using loop
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = input.nextInt();
		
		for (int i = 1; i<=10; i++) {
			System.out.println(num + " x " + i  +" = " + (num*i));
		}
		
		// program to find the factorial value of any number entered through the keyboard using loop
		int fact = 1;
		System.out.print("Enter any postive number: ");
		int value = input.nextInt();
		for (int i = 1; i<=value; i++) {
			fact *= i;
		}
		System.out.println(fact);	
		
		
		// program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros
		Scanner console = new Scanner(System.in);
		int number;
		int countPositive = 0;
		int countNegative = 0;
		int countZero = 0;
		char choice;
		
		System.out.print("Type y to start game");
		choice = console.next().charAt(0);
		
		while (choice == 'y') {
			System.out.println("Enter a number");
			number = console.nextInt();
			
			if (number > 0) {
				countPositive ++;
			}
			else if (number < 0) {
				countNegative ++;
			}
			else {
				countZero ++;
			}
			System.out.print("Do you want to continue y/n? ");
			choice = console.next().charAt(0);
		}
		 System.out.println("Positive numbers: " + countPositive);
	     System.out.println("Negative numbers: " + countNegative);
	     System.out.println("Zero numbers: " + countZero);
	     
	     
	     //program to calculate the sum of following series where n is input by user
	     
	     Scanner yourInput = new Scanner(System.in);
	     System.out.print("Enter number of terms of series : ");
	     int yourNumber = yourInput.nextInt();
	     double theSum = 0;
	     
	     for (int i=1; i<=yourNumber; i++) {
	    	theSum += 1.0/i;	 
	     }
	     System.out.println("sum" + sum);
	}

}
