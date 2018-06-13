
public class Tester {
	//main method makes a class executable 
	public static void main(String[] args) {
		//System.out.println("This is a test");
		Car myCar = new Car();
		// call instanstes, dot notation
		myCar.move();
		
		SUV mySUV = new SUV();
		mySUV.move();
		mySUV.steer();
		
		String name = "Michael";
		
		String newString = name.substring(4,7);
		
		System.out.println(newString);
	}
}
