import java.util.*;
public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		System.out.print("Enter your full name: ");
		String name = in.nextLine();
		
		System.out.println(name.substring(0,1));
		System.out.println(name.substring(0,name.indexOf(' ')));
	   System.out.println(name.substring(name.indexOf(' ')+1));
		System.out.println(name.substring(4,7));
	}

}
