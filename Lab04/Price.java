package unsw.movies;

public interface Price {
    public double getCharge(int daysRented);
    
    public void changeToRegular();
    public void changeToClassic();
    public void changeToNewRelease();
    public void changeToChildren();
    
}
