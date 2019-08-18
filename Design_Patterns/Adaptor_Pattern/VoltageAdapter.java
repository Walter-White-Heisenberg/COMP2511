package ClassAdapter;

public class VoltageAdapter extends Voltage220v implements Voltage5v {

	@Override
	public int output5v() {

		int src = output220v();
		int dest = src/44;
		return dest;
	}

}
