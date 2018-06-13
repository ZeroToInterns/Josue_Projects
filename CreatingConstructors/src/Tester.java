

public class Tester {

	
	
	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		chooseRoom("Dog",false ,'M');	
		chooseRoom("Cat", false,'F');
		//chooseRoom("Bird",false,'M');
		chooseRoom("dog",false,'C');
	}
		
		//helper method
	private static String determinedGender(char gender) {
		String result;
		if (gender == 'M') {
			
			result = "Male ";	
		}
		else if(gender =='F') {
			//System.out.println("Female ");
			result = "Female ";
		}
		else {
			//System.out.println("Not valid Gender\n");
			result = "Not Valid Gender for ";
		}
		return result;
	}
		
	public static void  chooseRoom(String animal,boolean isSick, char gender)
	{	
		//already passing if true, or false. 
		if (isSick) {
			System.out.println("We cannot accept\n");
		}
		//animal.equalsIgnoreCase
		// animal.equals("Dog") || animal.equals("dog")
		else {
		if (animal.equalsIgnoreCase("Dog") ){
			
			//System.out.println("Goes to Dog Room\n");
			//determinedGender(gender);
			System.out.println(determinedGender(gender)+"Dog");
			
		}
		
		
		else if (animal.equalsIgnoreCase("Cat") ){
			
			//System.out.println("Goes to Cat Room\n");
			determinedGender(gender);
		}
		else {
		System.out.println(animal+" is release\n");
		}
		}
	}
}
