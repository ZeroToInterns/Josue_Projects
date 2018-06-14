
public class SodaCan {

	public static final double DEFAULT_RADIUS = 1.2109;
	public static final double DEFAULT_HEIGHT = 4.704;
	public static final double FLUID_OUNCES_PER_CUBIC_INCHES = 0.554112554;
	
	private double radius;
	private double height;
	private double contents;
	
	
	public SodaCan() {
	
		radius = DEFAULT_RADIUS;
		height = DEFAULT_HEIGHT;
		double capacity = radius * height * Math.PI*FLUID_OUNCES_PER_CUBIC_INCHES;
		contents = capacity;
	}
	
	public SodaCan (double aRadius, double aHeight) {
			
			radius = aRadius;
			height = aHeight;
			double capacity = radius * height * Math.PI*FLUID_OUNCES_PER_CUBIC_INCHES;
			contents = capacity;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void drink (double fluid_ounces) {
		contents = contents - fluid_ounces;
		
	}
	public double getConents() {
		
		return contents;
	}
}
