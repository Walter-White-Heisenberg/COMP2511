package MovieRenting;

public class CostMethod1 implements CalculateMethods {

	@Override
	public double cost(int days) {
		int cost = 0;
		cost = 3*5 + (days-5)*2;
		return cost;
	}

}
