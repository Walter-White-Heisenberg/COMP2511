package VoltageExample;

public class Client {

	public static void main(String[] args) {
		Voltage220v v220 = new Voltage220v();
		Voltage5v v5 = new Adapter(v220);
		v5.voltage5v();

	}

}
