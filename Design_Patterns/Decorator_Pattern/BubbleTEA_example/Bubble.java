package MilkTea_practice;

public class Bubble extends Decorator {

	public Bubble(MilkTea milktea) {
		super(milktea);
		setCost(2.5);
		setDescription("add extra bubbles");
	}

}
