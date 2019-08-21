package VoltageExample;

public class Adapter implements Voltage5v{
	
	public String description;
	public double src;
	public double dest;
	public Voltage220v voltage220v;
	
	public Adapter(Voltage220v voltage220v) {
		this.voltage220v = voltage220v;
	}

	@Override
	public double voltage5v() {
		dest = 0;
		
		if (voltage220v != null) {
			src = voltage220v.getSrc220v();
			System.out.println("adapting...");
			dest = src/44;
			System.out.println("finished, now the voltage is " + dest);
		}
		
		return dest;
	}
}
