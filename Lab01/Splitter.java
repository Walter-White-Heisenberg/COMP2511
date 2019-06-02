import java.util.Scanner;
public class Splitter {

    public static void main(String[] args){
    	Scanner sc = null;
    	//try {
    		sc = new Scanner(System.in);
    		System.out.println("Enter a sentence specified by spaces only: ");
    		String Sentence = sc.nextLine();
    		// System.out.println(Sentence);
    		String[] sep = Sentence.split("\\s+");
    		for (String result : sep) {
    			System.out.println(result);
    		}
    	/*} catch (Exception e) {
    		e.printStackTrace();
    	  } finally {
    		if (sc != null) {
    			sc.close();
    			sc = null;
    	  }
    	}
        */
    }
}
