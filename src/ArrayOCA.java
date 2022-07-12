
public class ArrayOCA {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 2, 3, 1, 0 };
		
		System.out.println(a); // prints hash code
		System.out.println(a[3]); // prints index 3 of a, which is 4
		System.out.println(a[b[3]]); // b[3] is 0, so a[0] is 1, it prints 1
		
		System.out.println(a[(a = b)[3]]); // prints 1
		
		//row column
		int[][] c = { {1,2,3,4,5}, {1,2,3,4,5,6,7,8}, {1,2,3,4,5,6,7,8,9,10} }; // two dimensional array with three rows (0, 1, 2) and multiple columns
		System.out.println(c[0][3]); // 4
		System.out.println(c[1][7]); // 8
		System.out.println(c[2][0]); // 1
		
		int x[][][]=new int[5][8][10]; // three dimensional array, aka matrix
		System.out.println(x.length+" "+x[0].length+" "+x[0][0].length);
		
		//different types of array declaration
		int intArray[]; // or
		int[] intArray2;
		
		int[] intArray3;		//declaring array
		intArray3 = new int[20]; // allocating memory to array
		int[] intArray4 = new int[20]; // combining both statements in one
		//or 
		int intArray5[] = new int[20];
		
		int[] intArray6 = new int[]{ 1,2,3,4,5,6,7,8,9,10 };  // Declaring array literal
		
	}
}