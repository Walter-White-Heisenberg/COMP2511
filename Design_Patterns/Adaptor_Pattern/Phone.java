package ClassAdapter;

public class Phone {

	public void charging(Voltage5v voltage5v) {
		if (voltage5v.output5v() == 5) {
			System.out.println("you can charge");
		} else if (voltage5v.output5v() > 5) {
			System.out.println("voltage is too high");
		}
	}
	
}
