import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ArrayExercise {

	public static void main(String[] args) {
		
		// Arrays
		
		int intArray[] = new int[2]; // specify length of array
		intArray[0] = 2; // add values later
		intArray[1] = 4;
		int intArray2[] = new int[] {2, 4, 2}; // immediately add values, don't add length because this is calculated automatically
		System.out.println(Arrays.toString(intArray2));

		String StringArray[] = new String[] {"Hello", "World"};
		System.out.println(Arrays.toString(StringArray));
		
		String StringArray2[][] = new String[][] { {"Hello", "World" }, { "How are you", "doing today" } }; // multidimensional loop
		System.out.println(StringArray2); // prints location
		System.out.println(Arrays.toString(StringArray2)); // does not work for multidimensional arrays
		// use a for loop:
		for (int i = 0; i<StringArray2.length; i++) {
			for (int j = 0; j<StringArray2.length; j++) {
			System.out.println(StringArray2[i][j]);
			}
		}
		
		
		// Array Lists
		
		ArrayList<String> myArrayList = new ArrayList<String>(); // create an array list
		myArrayList.add("One");
		myArrayList.add("Three");
		myArrayList.add(1, "Two"); // add "Two" at index 1
		for (String i : myArrayList) { // print elements in an array list
			System.out.println(i);
		}
		
		ListIterator<String> iterator = myArrayList.listIterator(); // print elements in an array list using ListIterator
		while (iterator.hasNext()) {								
			System.out.println(iterator.next());
		}
		
		myArrayList.set(1, "One and a Half"); // with set you can replace an element, in this case at index 1 (which is "Two")
		for (String i : myArrayList) { 
			System.out.println(i);
		}
		
		
		ArrayList<StringBuilder> myList = new ArrayList<StringBuilder>();
		myList.add(new StringBuilder("One"));
		myList.add(new StringBuilder("Two"));
		myList.add(new StringBuilder("Three"));
		for (StringBuilder i : myList) {	// modify existing values of an ArrayList using StringBuilder (because normal Strings are immutable)
			i.append(i.length());
		}
		for (StringBuilder i : myList) {
			System.out.println(i);
		}
		
	}

}
