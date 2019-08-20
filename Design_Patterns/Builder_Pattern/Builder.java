package BuildProduct;

public interface Builder {
	Product product = new Product();
	
	public void buildFeature1();
	public void buildFeature2();
	public void buildFeature3();
	
	public Product buildProduct();
}
