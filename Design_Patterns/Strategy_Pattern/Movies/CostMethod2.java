package MovieRenting;

public class CostMethod2 implements CalculateMethods {
	int cost = 0;
	@Override
	public double cost(int days) {
		
		cost = days*5;
		return cost;
	}

}
