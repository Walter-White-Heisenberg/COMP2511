
public class Singleton_Static_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
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
	
	static class Singleton {
		// 1.  you can not new Singleton() in other places
		private Singleton() {
			
		}
		// step2
		private final static Singleton instance = new Singleton();
		
		// step3
		public static Singleton getInstance() {
			return instance;
		}
		
	}

}
