
public class Wrapper {

	public static void main(String[] args) {
	
	// How to create wrappers:
	// 1) assignment (autoboxing)
	Boolean bool1 = true;
	Byte byte1 = 1;
	Double double1 = 1.0;

	// 2) constructor
	//All wrappers classes (EXCEPT Character) define a constructor that accepts a String argument representing the primitive value that needs to be wrapped. These constructors do NOT have a no-argument constructor.
	Boolean bool2 = new Boolean(true);
	// Byte byte = new Byte (1); // You cannot pass integer literal to the constructor directly as Java think it is an int not a byte
	Byte byte2 = new Byte ("1"); //constructor that accepts String
	Double double3 = new Double ("10.98"); //constructor that accepts String
	Long long1 = new Long(2);

	// 3) static methods
	Boolean bool4 = Boolean.valueOf(true);
	Boolean bool5 = Boolean.valueOf("TrUE");
	Boolean bool6 = Boolean.TRUE; // for booleans you can also directly set the value to TRUE or FALSE		works because of auto-unboxing
	Double double4 = Double.valueOf(10);
	System.out.println(bool5);
	
	// valueOf()
	Long var1 = Long.valueOf(123);
	Long var2 = Long.valueOf("123");
	System.out.println(var1 == var2); // <- true, refer to same cached object

	Long var3 = Long.valueOf(223);
	Long var4 = Long.valueOf(223);
	System.out.println(var3 == var4); // <- false, refer to different objects
	
	Boolean bool7 = false;
	System.out.println(Boolean.valueOf(bool7));


	// comparing objects of wrapper classes
	
	Integer i1 = new Integer(10);
	Integer i2 = new Integer(10);
	System.out.println(i1 == i2); // false because constructors always create new instances
	
	Integer i3 = Integer.valueOf(10);
	Integer i4 = Integer.valueOf(10);
	System.out.println(i3 == i4); // true because valueOf() returnes a cached copy for int value 10
	
	Integer i5 = 10;
	Integer i6 = 10;
	System.out.println(i5 == i6); // true because autoboxing returns a cached value copy for applicable values
	System.out.println(i4 == i5); // true, instances created using the method valueOF() and autoboxing for int value 10 refer to the same instance 
	System.out.println(i3 == i6); // true 
	
	System.out.println(i1.equals(i2)); // true
	System.out.println(i4.equals(i5)); // true
	System.out.println(i2.equals(i6)); // true
	// THIS IS NOT TRUE FOR INTEGER INSTANCES CREATED FOR INT VALUE < -127 or > 128 !! 		NO COPIES ARE CACHED
	
	
	// You can't compare wrapper instances for equality using .equals() or ==, if they aren't of the same class: 
	Integer obj1 = 100;
	Short obj2 = 100;
	System.out.println(obj1.equals(obj2)); // outputs false, Short and Integer are not of the same class
	// System.out.println(obj1 == obj2); // does not compile because neither are primitives
	
	
	// comparing Wrappers with primitives
	
		// values of primitive integers and wrapper Integers are the same when using both == or .equals()	
	
	int int1 = 6;
	Integer int2 = 7;
	System.out.println(int1 == int2); // false, not the same value
	System.out.println(int2.equals(int1)); // false, not the same value
	// System.out.println(int1.equals(int2)); does not compile because int1 is a primitive, and so does not have access to .equals()
	
	int int3 = 6;
	Integer int4 = 6;
	System.out.println(int1 == int3); // true, same value
	System.out.println(int1 == int4); // true, same value
	System.out.println(int4.equals(int1)); // true, same value
	
	int int5 = 6;
	Byte byte3 = 6;
	System.out.println(int5 == byte3); // true
	System.out.println(byte3.equals(int5)); // false, Byte is of a different class than integer int5
	
	
	

	
	

	}

}
