
public class Person {

	private String name;
	private int age; 
	private char gender;
	private double weight;
	private String hairColor;
	private String height;
	
	//initializing contructor allows you to
	public Person (String myname, int myage, char mygender, 
			double myweight, 
			String myhairColor, String myheight) {
		
		name = myname;
		age = myage;
		gender = mygender;
		weight = myweight;
		hairColor = myhairColor;
		height = myheight;
		
	}
	
	public Person (String aname, int aage) {
		
		name = aname;
		age = aage;
	}
	
	//its like a sandbox method. needs instruction to play
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// calling constuctor and setting new values
		
		Person newPerson  = new Person("Micheal",25, 'M',156, "Brown", "5,7");
		Person newPerson1 = new Person ("James",56);
		System.out.println(newPerson.name);
		
		
		newPerson1.setName("Chango");
		System.out.println(newPerson1.name);
		newPerson.sethairColor("Red");
		System.out.println(newPerson.hairColor);
		// extensuate
	}
	
	//get set name, get set hairccolor
	
	public String getName()
	{
		return name;
	}
	public void setName(String a) {
		//set the name to hello, name ="Hello"; but we dont want that. 
		name  = a;
	}
	// set return type is always void. 
	//Set doesn't return anything. 
	//update 
	public String getHairColor() {
		return hairColor;
	}
	public void  sethairColor(String newColor) {

		hairColor = newColor;
	}

}
