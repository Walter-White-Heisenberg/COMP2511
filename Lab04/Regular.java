package unsw.movies;

public class Regular implements Price {
	Movie movie;
	
    public Regular(Movie movie) {
		this.movie = movie;
	}
	@Override
	public void changeToRegular() {
		
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
		System.out.println("==============change to Childrens===============");
		movie.setPrice(movie.getChildrensPrice());
	
	}

	@Override
    public double getCharge(int daysRented) {
        double charge = 2;
        if (daysRented > 2)
            charge += (daysRented - 2) * 1.5;
        return charge;
    }

}
