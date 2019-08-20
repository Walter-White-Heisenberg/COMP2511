package BuildProduct;

public class ProductB implements Builder {

	@Override
	public void buildFeature1() {
		System.out.println("build feature1 for type B");
		
	}

	@Override
	public void buildFeature2() {
		System.out.println("build feature2 for type B");
		
	}

	@Override
	public void buildFeature3() {
		System.out.println("build feature3 for type B");
		
	}

	@Override
	public Product buildProduct() {
		return product;
	}

}
