package unsw.collections;

import org.junit.jupiter.api.Test;

import unsw.fruit.Apple;
import unsw.fruit.Fruit;
import unsw.fruit.Orange;
import static org.junit.jupiter.api.Assertions.*;

class ArrayListSetTest {

    @Test
    void testBasics() {
        Set<String> set = new ArrayListSet<>();
        set.add("Hello");
        set.add("World");
        assertTrue(set.contains("Hello"));
        assertTrue(set.contains("World"));

        set.remove("Hello");
        assertFalse(set.contains("Hello"));
        assertTrue(set.contains("World"));
    }

    @Test
    void testSubsetOf() {
        Set<Fruit> fruit = new ArrayListSet<Fruit>();
        fruit.add(new Apple("Gala"));
        fruit.add(new Apple("Fuji"));
        fruit.add(new Orange("Navel"));

        Set<Apple> apples = new ArrayListSet<>();
        apples.add(new Apple("Gala"));
        apples.add(new Apple("Fuji"));

        assertTrue(apples.subsetOf(fruit));
        assertFalse(fruit.subsetOf(apples));

        fruit.remove(new Apple("Fuji"));

        assertFalse(apples.subsetOf(fruit));
    }

    @Test
    void testAppleSize() {
        /*
         * This has test add and remove function
         */
        Set<Fruit> apples = new ArrayListSet<Fruit>();

        Apple a1 = new Apple("a1");
        Apple a2 = new Apple("a2");
        Apple a3 = new Apple("a3");

        apples.add(a1);
        assertEquals(1, apples.size());

        apples.add(a1);
        assertEquals(1, apples.size());

        apples.add(a2);
        assertEquals(2, apples.size());

        apples.add(a3);
        assertEquals(3, apples.size());

        apples.add(a2);
        assertEquals(3, apples.size());

        apples.remove(a3);
        assertEquals(2, apples.size());

        apples.remove(a3);
        assertEquals(2, apples.size());

        apples.remove(a2);
        assertEquals(1, apples.size());

    }

    @Test
    void testUnion() {
        Set<Fruit> apple1 = new ArrayListSet<Fruit>();
        Set<Fruit> apple2 = new ArrayListSet<Fruit>();
        Set<Fruit> apple3 = apple1.union(apple2);

        assertEquals(0, apple3.size());

        Apple a1 = new Apple("a1");
        Apple a2 = new Apple("a2");
        Apple a3 = new Apple("a3");

        apple1.add(a1);
        apple2.add(a2);
        apple2.add(a3);

        apple3 = apple1.union(apple2);
        assertEquals(3, apple3.size());

    }

    @Test
    void testIntersection() {
        Set<Fruit> apple1 = new ArrayListSet<Fruit>();
        Set<Fruit> apple2 = new ArrayListSet<Fruit>();
        Set<Fruit> apple3 = apple1.intersection(apple2);

        assertEquals(0, apple3.size());

        Apple a1 = new Apple("a1");
        Apple a2 = new Apple("a2");
        Apple a3 = new Apple("a3");

        apple1.add(a1);
        apple2.add(a1);
        apple2.add(a2);
        apple2.add(a3);

        apple3 = apple1.intersection(apple2);

        assertEquals(1, apple3.size());

        apple1.remove(a1);
        apple2.remove(a1);
        apple2.remove(a2);
        apple2.remove(a3);
        apple3.remove(a1);

        assertEquals(0, apple1.size());
        assertEquals(0, apple2.size());
        assertEquals(0, apple3.size());

        apple1.add(a1);
        apple2.add(a2);

        apple3 = apple1.intersection(apple2);

        assertEquals(0, apple3.size());
    }

    @Test
    void testContain() {

        Set<Fruit> apple1 = new ArrayListSet<Fruit>();
        Set<Fruit> apple2 = new ArrayListSet<Fruit>();


        Apple a1 = new Apple("a1");
        Apple a2 = new Apple("a2");
        Apple a3 = new Apple("a3");

        apple1.add(a1);
        apple2.add(a2);

        assertTrue(apple1.contains(a1));
        assertFalse(apple1.contains(a2));
        assertTrue(apple2.contains(a2));
        assertFalse(apple2.contains(a1));
        assertFalse(apple1.contains(a3));
        assertFalse(apple2.contains(a3));
    }

    @Test
    void testEqual() {
        Set<Fruit> apple1 = new ArrayListSet<Fruit>();
        Set<Fruit> apple2 = new ArrayListSet<Fruit>();


        Apple a1 = new Apple("a1");
        Apple a2 = new Apple("a2");
        Apple a3 = new Apple("a3");

        apple1.add(a1);
        apple2.add(a1);

        assertEquals(apple1, apple2);

        apple2.add(a2);
        assertNotEquals(apple1, apple2);

        apple1.add(a3);

        assertNotEquals(apple1, apple2);


    }

}
