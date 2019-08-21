package MilkTea_practice;

public class TaroBalls extends Decorator{
	public TaroBalls(MilkTea milktea) {
		super(milktea);
		setCost(3.00);
		setDescription("add extra taro balls");
		
	}
}
