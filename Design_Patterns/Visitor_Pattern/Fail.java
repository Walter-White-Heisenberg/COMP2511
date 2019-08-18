package Visitor_singer;

public class Fail extends Action {

	@Override
	public void getManResult(Man man) {
		System.out.println("Man gives a FAIL to singer");
		
	}

	@Override
	public void getWomanResult(Woman woman) {
		System.out.println("Woman gives a FAIL to singer");
		
	}

	
	
}
