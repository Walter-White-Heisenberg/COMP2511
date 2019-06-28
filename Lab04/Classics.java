package unsw.movies;

public class Classics implements Price {
	Movie movie;
	public Classics(Movie movie) {
		this.movie = movie;
	}
	
	public void after2month() {
		System.out.println("its a classic movie");
	}
	
	public void getAward() {
		System.out.println("Award Winning classic Film");
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
