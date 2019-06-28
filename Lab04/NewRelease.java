package unsw.movies;

public class NewRelease implements Price {
	Movie movie;
	public NewRelease(Movie movie) {
		this.movie = movie;
	}
	
	public void after2month() {
		movie.setPrice(movie.getRegular());
		System.out.println("this movie has been published 2 months, its now in Regular Category!");
	}
	
	public void getAward() {
		movie.setPrice(movie.getClassics());
		System.out.println("Award Winning Film, it's now Classic!");
	}
	
    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

}
