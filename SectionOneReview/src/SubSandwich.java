
public class SubSandwich {

	public static final int CHICKEN = 0;
	public static final int PASTRAMI = 1;
	public static final double COST_FOR_EXTRA_MEAT = 1.50;
	
	private int type;
	private int size;
	private boolean meat;
	public SubSandwich(int theType, int theSize, boolean extraMeat) {
		type = theType;
		size = theSize;
		meat = extraMeat;
		if(type == CHICKEN && type == PASTRAMI) {
			type = PASTRAMI;
		}
		if (size != 6 && size !=12) {
			size = 12;
		}
	}
	public int getSize() {
		return size;
	}
	public void setSize(int newSize) {
		size = newSize;
		if(size == 6) {
			size =6;
		}
		else {
			size = 12;
		}
	}
	public boolean isExtraMeat() {
			if(meat ==true) {
				return true;
			}
			else {
				return false;
			}
		
	}
	public String getType() {
		if(type == CHICKEN) {
			return "chicken";
		}
			else {
				return "pastrami";
			}
		}
	public double getCost() {
		double cost = 0 ;
			if (type == CHICKEN && size ==6) {
					cost = 5.50;
				}
				else if(type == CHICKEN && size ==12) {
					cost = 8.95;
				}
				else if(type == PASTRAMI && size ==6) {
					cost = 6.95;
				}
				else {
					cost = 9.50;
				}
				if(meat ==true ){
				   cost = cost +COST_FOR_EXTRA_MEAT;
				}
				else {
				  
				}
		return cost;
	}
}
