package unsw.movies;

public class Classic implements Price {
    @Override
    public double getCharge(int daysRented) {
        double charge = 2;
        if (daysRented > 5)
            charge += (daysRented - 5) * 1;
        return charge;
    }

    Movie movie;
	
    public Classic(Movie movie) {
		this.movie = movie;
	}

	@Override
	public void changeToRegular() {
		System.out.println("==============change to Regular===============");
		movie.setPrice(movie.getRegularPrice());
		
	}

	@Override
	public void changeToClassic() {
		
	}

	@Override
	public void changeToNewRelease() {
		System.out.println("==============" + movie.getTitle() + " "+ "change to New Release===============");
		movie.setPrice(movie.getNewReleasePrice());
	
	}

	@Override
	public void changeToChildren() {
		System.out.println("==============change to Childrens===============");
		movie.setPrice(movie.getChildrensPrice());
		
	}


}
