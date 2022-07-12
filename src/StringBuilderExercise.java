
public class StringBuilderExercise {

	public static void main(String[] args) {
		
		// String
		String st = new String();
		String st1 = "Hello World";
		System.out.println(st1.length()); // prints the number of characters, including spaces
		System.out.println(st1.lastIndexOf("o")); // the last index of "o" is 7
		System.out.println(st1.startsWith("W")); // returns false, String st1 does not start with "W"
		System.out.println(st1.charAt(3)); // prints character at index 3, which is "l"
		
		// StringBuilder
		StringBuilder sb1 = new StringBuilder();
		sb1.append(1); // add a integer, float, double, char, boolean, or an object
		sb1.append(false);
		System.out.println(sb1); // StringBuilder is mutable, so when sb1 is printed the 1 and the false are added
		sb1.insert(1, 2); // insert a 2 at index 1
		System.out.println(sb1);
		sb1.delete(1, 2); // delete index 1 (inclusive) until 2 (exclusive), so only the element at index 1 will be deleted
		System.out.println(sb1);
		
		System.out.println(sb1.charAt(0));
		System.out.println(sb1.indexOf("false")); // returns the index of the String 'false' which is 1
		// System.out.println(sb1.indexOf(1)); indexOf cannot find the index of primitives
		
		System.out.println(sb1.append("Sp ace"));
		System.out.println(sb1);
		System.out.println(sb1.length()); // prints the number of characters, including spaces

	}
	
	
	// String and StringBuilder both have: chatAt(), indexOf(), substring()
	//									   length()
	// Strings are immutable, methods that seem to modify a String are: trim() and replace()
	// StringBuilders are mutable, methods that modify the StringBuilder are: append(), insert(), delete()
	// Other methods for String include startsWith() and endsWith()
	// Other methods for StringBuilder include trimToSize() and setLength()
}
