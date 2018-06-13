
public class Person implements Comparable, Speakable
{

	 String name;
	private double GPA;
	public int age;
	@Override
	
	//create a compateTO method that compares people by age
	public int compareTo(Object o) {
		// TODO Auto-generated method
		Person otherPerson = (Person) o;
		if (this.age > otherPerson.age){
			return 1;
		}
		else if (this.age < otherPerson.age)
		{
			return -1;
		}
		else 
		{
			return 0;
		}
		
	
	}
	
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
	}
	
	
	
}