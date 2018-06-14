import java.util.*;
public class InputApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner (System.in);
		
		System.out.print("Enter a your favorite dessert: ");
		
		//favorite dessert input
		String word = in.nextLine();
		System.out.println(word.substring(word.length()-1));
		
		System.out.print("Enter a double: ");
		double num = in.nextDouble();
		
		System.out.print("Enter an integer: ");
		int integer = in.nextInt();
		
		double product = num *integer;
		
		System.out.println("Product: "+ product);
		
		System.out.println("Integer portion: "+(int)product);
	}

}
