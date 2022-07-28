package Loops;

public class NTRCounters {

	public static void main(String[] args) {
		
		int x = 0;
		loop: for (int i = 1; i < 5; i++){
	         for (int j = 1; j < 5; j++){
	            System.out.println("i = " + i);
	            if (x == 0) {  continue loop;  }
	            System.out.println("j = " + j);
	            
	         }
		}
	}

}
