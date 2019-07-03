package unsw.movies;

import java.util.ArrayList;
import java.util.List;

//import com.sun.swing.internal.plaf.metal.resources.metal;

public class Customer {

    private String name;
    private List<Rental> rentals;

    public Customer(String name) {
        this.name = name;
        this.rentals = new ArrayList<>();
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {

        double totalAmount = 0;
        String result = "Rental Record for " + getName() + "\n";

        for (Rental r : rentals) {
            // show figures for this rental
            result += "\t" + r.getMovie().getTitle() + "\t" + r.getCharge() + "\n";
            totalAmount += r.getCharge();

        }

        // add footer lines
        result += "Amount owed is " + totalAmount + "\n";
        return result;
    }

    public static void main(String[] args) {
        Customer c1 = new Customer("Mary Jane Watson");
        Movie movie= new Movie("Gone with the wind");
        movie.setPrice(new NewRelease(movie));
        System.out.println("now the Price type of the movie is " + movie.getPrice());
        System.out.println("\n BECOMES REGULAR------------>");
        movie.becomeRegular();
        System.out.println("now the Price type of the movie is " + movie.getPrice());
        Rental r = new Rental(movie, 3);
        c1.addRental(r);

        movie = new Movie("Finding Nemo");
        movie.setPrice(new Childrens(movie));
        System.out.println("\n\nnow the Price type of the movie is " + movie.getPrice());
        System.out.println("\n TRY TO CHANGE IT TO CHILDREN------------->");
        movie.becomeChildrens();
        System.out.println("now the Price type of the movie is " + movie.getPrice());
        
        r = new Rental(movie, 7);
        c1.addRental(r);

        System.out.println(c1.statement());


    }
}
