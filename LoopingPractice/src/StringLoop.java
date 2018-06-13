
public class StringLoop {

	public void hundred () {
		for (int i = 0; i <= 100; i++) {
			System.out.println("The number is " + i);
		}
	}
	
	public void even() {
		for (int i = 0; i <= 100; i+=2) {
			System.out.println("The number is "+i);
		}
	}
	
	//using the loop count variable to fin
	public int countNumberOfO(String word) {
		int count = 0;
		//the value of i is less than length of the word
		for(int i = 0; i < word.length(); i++) {
			//declare a variable
			if(word.substring(i, i+1 ).equalsIgnoreCase("o"))
			{
				//return a conditon it always boolean 
				count++;
			}
		}
		return count;
	}
	
	public void wordLoop(String word) {
		
		for (int i = 0; i < word.length(); i++) {
			
			
			for (int j = 0; j < i+1 ; j++) {
				String letter = word.substring(i,i+1);
				System.out.print(letter);
				//if (letter.equals("0")) {
					//throw new Exception();
				//}
				//System.out.println(letter);
			}
			System.out.println("");
		}
		
	}
	
	public void printString(String word) 
	{
		try 
		{
		 for (int i = 0; i < word.length()+1; i++) 
		 {
			System.out.println(word.substring(i, i+1));
		 }
		}
		catch(Exception e) {
			System.out.println("Wtf");
	}
		}	
	//using modifed for loops to iterate over the entire string. 
	//error because String is not a subclass of collection, its a subclass of object. 
	public int countO(String word) {
		int count = 0;
		for(String firstLetter : word) {
			if(firstLetter.equalsIgnoreCase("o")) {
				count++;
			}
		}
		return count;
}
	

}