package unsw.collections;

import unsw.fruit.*;

public class TestClass {

	public static void main(String[] args) {
        Set<Fruit> fruit = new ArrayListSet<Fruit>();
        fruit.add(new Apple("Gala"));
        fruit.add(new Apple("Fuji"));
        fruit.add(new Orange("Navel"));

        Set<Apple> apples = new ArrayListSet<>();
        apples.add(new Apple("Gala"));
        apples.add(new Apple("Fuji"));

        for (Fruit f : fruit.intersection(apples)) {
        	System.out.println(f.getName());
        }

	}

}
