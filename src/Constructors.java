
public class Constructors {

	public static void main(String[] args) {
		
		

	}
	

}

class SuperClass()	{}

class SubClass extends SuperClass{
     int i, j, k;
     public SubClass( int m, int n )     {  i = m ;  j = m ;  } //1
     public SubClass( int m )  {   super(m );   } //2
 }
