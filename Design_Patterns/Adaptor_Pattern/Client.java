package ClassAdapter;

public class Client {
	public static void main(String[] args) {
		System.out.println("==========class adapter==============");
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter());
	}
}
