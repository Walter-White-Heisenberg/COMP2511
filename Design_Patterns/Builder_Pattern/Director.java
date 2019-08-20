package BuildProduct;

public class Director {
	Builder builder;
	
	public void ProductDirector(Builder builder) {
		this.builder = builder;
	}
	
	public Product Construct() {
		builder.buildFeature1();
		builder.buildFeature2();
		builder.buildFeature3();
		return builder.buildProduct();
	}
}
