package MovieRenting;

public class CostMethod3 implements CalculateMethods {
	Movies movie;
	public CostMethod3(Movies movie) {
		this.movie = movie;
	}
	
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

	@Override
	public void changeToMethod1() {
		// TODO Auto-generated method stub

		movie.setMethod(movie.getCostMethod1());
	}

	@Override
	public void changeToMethod2() {
		// TODO Auto-generated method stub

		movie.setMethod(movie.getCostMethod2());
	}

	@Override
	public void changeToMethod3() {
		// TODO Auto-generated method stub
		
	}

}
