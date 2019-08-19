

public class Singleton_Static_Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();
		
		// s1 and s2 are true means they are the same object
		System.out.println(s1==s2);
	}
	
	// We use static variable to do the singleton pattern
	// the purpose of the singleton pattern is to make sure
	// for certain class, there can only be only one object instance of its classes
	
	/* 1. Make the constructor private, so that no one can new the object outside of the class
	 * 2. Create the object instance inside of the Class
	 * 3. provide a method - getInstance() - for the invokers 
	 */
	
	static class Singleton1 {
		// 1.  you can not new Singleton() in other places
		private Singleton1() {
			
		}
		// step2
		private static Singleton1 instance;
		
		static {
			instance = new Singleton1();
		}
		
		// step3
		public static Singleton1 getInstance() {
			return instance;
		}
		
	}

}
