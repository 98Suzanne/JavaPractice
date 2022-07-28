package Loops;

public class ArrayLoop {

	public static void main(String[] args) {

		int[][] ab = { { 1, 2, 3 }, { 4, 5 } };
		System.out.println(ab.length); // length is number of rows, so 2
		System.out.println(ab[0].length); // length[0] is size of the first row with index 0, so 3
		System.out.println(ab[1].length); // length[1] is size of the second row with index 1, so 2
		for (int i = 0; i < ab.length; i++) {
			for (int j = 0; j < ab[i].length; j++) { // why does ab[i] length decrease??
				System.out.print(ab[i][j] + " ");
				if (ab[i][j] == 2) {
					break;
				}
			}
			continue;
		}

	}

}
