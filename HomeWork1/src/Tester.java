
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student myStudent = new Student("Michael",4.0);
		System.out.println(myStudent.getName());
		myStudent.setName("Mike");
		
		System.out.println(myStudent.getGpa());
		myStudent.changeGpa(3.9);
		System.out.println("The student " +myStudent.getName()+ " has a GPA of "+ myStudent.getGpa());
	
	}

}
