
public class Student {

	private String name;
	private double gpa;
	
	public Student(String aName, double aGpa){
		
		name = aName;
		gpa = aGpa;
	}
	
	public String getName() {
		return name;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	public void changeGpa(double newGpa) {
		gpa = newGpa;
	}
	
}
