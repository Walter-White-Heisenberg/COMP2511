package MilkTea_practice;

public class Decorator extends MilkTea {
	MilkTea milktea;
	
	public Decorator(MilkTea milktea) {
		this.milktea = milktea;
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + ": " + super.getCost() + " && " + milktea.getDescription();
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return milktea.cost() + super.getCost();
	}

}
