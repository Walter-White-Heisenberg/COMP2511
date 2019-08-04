package unsw.movies;

public class NewRelease implements Price {
	Movie movie;
	
    public NewRelease(Movie movie) {
		this.movie = movie;
	}

	@Override
	public void changeToRegular() {
		movie.setPrice(movie.getRegularPrice());
		System.out.println("==============" + movie.getTitle() + " "+ "change to Regular===============");
		
	}

	@Override
	public void changeToClassic() {
		System.out.println("==============change to Classic===============");
		movie.setPrice(movie.getClassicPrice());
		
	}

	@Override
	public void changeToNewRelease() {
		
	}

	@Override
	public void changeToChildren() {
		System.out.println("==============change to Childrens===============");
		movie.setPrice(movie.getChildrensPrice());

	}

	@Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

}
