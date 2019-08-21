package MovieRenting;

public class CostMethod2 implements CalculateMethods {
	int cost = 0;
	Movies movie;
	
	public CostMethod2(Movies movie) {
		this.movie = movie;
	}
	
	@Override
	public double cost(int days) {
		
		cost = days*5;
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
	}
	@Override
	public void changeToMethod3() {
		// TODO Auto-generated method stub

		movie.setMethod(movie.getCostMethod3());
	}

}
