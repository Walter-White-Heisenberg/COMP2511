package MilkTea_practice;

public class Client {
	public static void main(String[] args) {
		MilkTea milktea = new ThaiMilkTea();
		milktea = new TaroBalls(milktea);
		milktea = new Bubble(milktea);
		
		System.out.println(milktea.getDescription());
		System.out.println(milktea.cost());
	}
}
