package MovieRenting;

public class CostMethod1 implements CalculateMethods {
	Movies movie;
	
	public CostMethod1(Movies movie) {
		this.movie = movie;
	}
	
	@Override
	public double cost(int days) {
		int cost = 0;
		cost = 3*5 + (days-5)*2;
		return cost;
	}

	@Override
	public void changeToMethod1() {
		// TODO Auto-generated method stub
	}

	@Override
	public void changeToMethod2() {
		// TODO Auto-generated method stub

		movie.setMethod(movie.getCostMethod2());
	}

	@Override
	public void changeToMethod3() {
		// TODO Auto-generated method stub

		movie.setMethod(movie.getCostMethod3());
	}

}
