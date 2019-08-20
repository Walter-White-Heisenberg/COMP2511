package BuildProduct;

public class Client {

	public static void main(String[] args) {
		Builder builderA = new ProductA();
		
		Director director = new Director();
		director.ProductDirector(new ProductB());
		director.Construct();

	}

}
