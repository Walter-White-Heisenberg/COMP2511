package unsw.movies;

public class Regular implements Price {
	Movie movie;
	public Regular(Movie movie){
		this.movie = movie;
	}
	
	public void after2month() {
		System.out.println("this movie has been published 2 months ago");
	}
	
	public void getAward() {
		movie.setPrice(movie.getClassics());
		System.out.println("Award Winning Film, it's now Classic!");
	}
	
    @Override
    public double getCharge(int daysRented) {
        double charge = 2;
        if (daysRented > 2)
            charge += (daysRented - 2) * 1.5;
        return charge;
    }

}
