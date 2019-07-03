package unsw.movies;

public class Classics implements Price {
	Movie movie;
	public Classics(Movie movie) {
		this.movie = movie;
	}
    @Override
	public Price becomeRegular() {
		// TODO Auto-generated method stub
    	System.out.println("This movie becomes a Regular-type movie");
		return new Regular(movie);
	}

	@Override
	public Price becomeClassics() {
		// TODO Auto-generated method stub
		System.out.println("This movie is already a Classic movie");
		return this;
	}

	@Override
	public Price becomeChildrens() {
		// TODO Auto-generated method stub
		System.out.println("This movie becomes a Childrens-type movie");
		return new Childrens(movie);
	}

	@Override
	public double getCharge(int dayRented) {
		// 5days->$2, after 5days->$1 each day
		double charge = 2.0;
		if (dayRented > 5)
			charge += (dayRented - 5) * 1.0;
		return charge;
	}
}
