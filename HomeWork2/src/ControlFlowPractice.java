
public class ControlFlowPractice {

	public double calculateCost(double distance) {
		//dont need cost;
		double cost =0;
		if (distance >= 50)
		{
			return cost = 100;
		}
		else if (distance >=25 && distance < 50 )
		{
			return cost = 50;
		}
		
		else if (distance >= 0 && distance < 25)
		{
			return cost = 10;
		} 
		
		else {
			return cost;
		}
		//return cost;
	}
	
	public static void rollDice (int value)
	{
		switch (value)
		{
			case 1: 
			System.out.println("The value rolled is " +value);
			break;
			case 2: 
				System.out.println("The value rolled is " +value);
			break;
			case 3: 
				System.out.println("The value rolled is " +value);
				break;
			case 4: 
				System.out.println("The value rolled is " +value);
				break;
			case 5: 
				System.out.println("The value rolled is " +value);
				break;
			case 6: 
				System.out.println("The value rolled is " +value);
				break;
			default: 
				System.out.println("Shit");
	    //default when it doesnt equal any case. 
		}
	}
	
	public int findLetterAt (String letter, String word)
	{
		int count = 0;
		for (int i = 0; i < letter.length(); i++)
		{
			if (word.substring(i, i+1).equals(letter))
			{
				if(count == 1)
				{
					return i;
				}
				else 
				{
					return count++;
				}
				
			}
		}
		return count;
	}
	
}
