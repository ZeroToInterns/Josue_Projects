
public class Thermometer {

	private int temperature;
	
	public void raiseTemp() {
		//raise the temperature to 90
		//what if temp is greater than 90
		if (temperature>90) {
			while(temperature > 90) {
				temperature --;
			}
		}
		//edgecase 90, critical point 
		else {
		while(temperature < 90) {
			temperature++;
			
		}
		}
	}
	
}
