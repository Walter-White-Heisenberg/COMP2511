package MovieRenting;

public class CostMethod3 implements CalculateMethods {

	@Override
	public double cost(int days) {
		int cost = 0;
		
		for (int i=0; i < days; i++) {
			if (i < 5) {
				cost = cost + 2;
			} else {
				cost = cost + 1;
			}
		}
		return cost;
	}

}
