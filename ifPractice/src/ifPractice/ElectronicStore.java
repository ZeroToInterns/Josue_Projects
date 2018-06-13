package ifPractice;

public class ElectronicStore {
	

	
	public void getPrice(String item, boolean isDamage) {
		if(isDamage) {
	
			if(item == "Ipad") {
			
				System.out.println("price is $250"); 
			}
			else if(item == "Macbook")
			{
				System.out.println("price is $900"); 
			}
			else if(item == "Phone")
			{
				System.out.println("price is $600"); 
			}
			else 
			{
				System.out.println("No item in store\n");
			}
		}
		//not damaged
		else {
			if(item == "Ipad") {
				
				System.out.println("price is $500"); 
			}
			else if(item == "Macbook")
			{
				System.out.println("price is $1800"); 
			}
			else if(item == "Phone")
			{
				System.out.println("price is $1200"); 
			}
			else 
			{
				System.out.println("No item in store\n");
			}
			
		
		}
	}
}