import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ControlFlowPractice hi = new ControlFlowPractice();
		
		
//		ControlFlowPractice.rollDice(1);
//		ControlFlowPractice.rollDice(2);
//		ControlFlowPractice.rollDice(3);
//		ControlFlowPractice.rollDice(4);
//		ControlFlowPractice.rollDice(5);
//		ControlFlowPractice.rollDice(6);
//		System.out.println("");
//		System.out.println(hi.calculateCost(15));
//		System.out.println(hi.findLetterAt("o", "Hello World"));
		
		
		
	}
	
	@Test
	public void testCalculatedCost()
	{
		ControlFlowPractice obj = new ControlFlowPractice();
		//System.out.println(//obj.calculateCost(100));
		assertTrue(obj.calculateCost(100) == 100.0);
		
	}
}
