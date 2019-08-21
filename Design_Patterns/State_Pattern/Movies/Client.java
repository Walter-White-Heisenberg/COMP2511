package MovieRenting;

public class Client {

	public static void main(String[] args) {
		Movies lionking = new NewMovie(10);
		System.out.println(lionking.getDescription());
		System.out.println(lionking.getCost());
		lionking.changeToMethod2();
		System.out.println(lionking.getCost());
		

		
	}

}
