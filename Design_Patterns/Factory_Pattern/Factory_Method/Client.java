package Factory_Method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String type = getType();
		PrepareOrder order;
		if (type.equals("A")) {
			order = new PrepareOrderA();
			
		} else if (type.equals("B")) {
			order = new PrepareOrderB();
		}		
	}
	public static String getType() {
		try {
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Type A or Type B: ");
			String type = stdin.readLine();
			return type;
		}catch(IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
