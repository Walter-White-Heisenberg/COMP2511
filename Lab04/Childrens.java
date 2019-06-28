package unsw.movies;

public class Childrens implements Price {
	Movie movie;
	public Childrens(Movie movie) {
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
    	// 1.5 one day
        double charge = 1.5;
        if (daysRented > 3)
        	// charge = charge + (rent days-3)*1.5
            charge += (daysRented - 3) * 1.5;
        return charge;
    }

}
