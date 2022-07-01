import java.util.Arrays;

public class Exercises {

	public static void main(String[] args) {
		
		//1 Print de concatenatie van een aantal strings.
		String po = "po";
		String ging = "ging";
		String en = "en";
		
		System.out.println(po + ging + en);
		
		
		//2 Tel het aantal keer dat de letter "e" in een gegeven string voorkomt.
		String woord = "regenen";
		char character = 'e';
		int count = 0;
		for (int i = 0; i < woord.length(); i++) {
			if (woord.charAt(i) == character) {
				count++;
			}
		}
		System.out.println(count);
		
		
		//3 Berekend de som van alle array elementen.
		int[] numbers = {1, 2, 3, 4};
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			
			
		}
		System.out.println(sum);
		
		
		//4 Maak een array met 10 random getallen die deze in de volgorde van generering toont.
			// Toon daarna deze array in gesorteerde volgorde.
		
		int[] toSort = {10, 9, 3, 7, 5, 6, 4, 8, 2, 1};
		Arrays.sort(toSort);
		for (int i = 0; i < toSort.length; i++) {
			System.out.println(toSort[i]);
		}
		
		
		// 
		
	}

}
