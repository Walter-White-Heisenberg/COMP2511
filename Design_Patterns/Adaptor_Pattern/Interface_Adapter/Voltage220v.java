package VoltageExample;

public class Voltage220v {
	private String description;
	private double src220v;
	
	public Voltage220v() {
		description = "This is 220v voltage (src)";
		src220v = 220;
	}

	public String getDescription() {
		return description;
	}

	public double getSrc220v() {
		return src220v;
	}
	
	

}
