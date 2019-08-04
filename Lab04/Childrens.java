package unsw.movies;

public class Childrens implements Price {

    @Override
    public double getCharge(int daysRented) {
        double charge = 1.5;
        if (daysRented > 3)
            charge += (daysRented - 3) * 1.5;
        return charge;
    }

	Movie movie;
	
    public Childrens(Movie movie) {
		this.movie = movie;
	}

	@Override
	public void changeToRegular() {
		System.out.println("==============change to Regular===============");
		movie.setPrice(movie.getRegularPrice());
		
	}

	@Override
	public void changeToClassic() {
		System.out.println("==============change to Classic===============");
		movie.setPrice(movie.getClassicPrice());
		
	}

	@Override
	public void changeToNewRelease() {
		System.out.println("==============change to New Release===============");
		movie.setPrice(movie.getNewReleasePrice());
		
	}

	@Override
	public void changeToChildren() {
		
	}

}
