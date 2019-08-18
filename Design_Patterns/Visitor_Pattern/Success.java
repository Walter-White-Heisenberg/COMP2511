package Visitor_singer;

public class Success extends Action {

	@Override
	public void getManResult(Man man) {
		System.out.println("man gives Success to singer");
		
	}

	@Override
	public void getWomanResult(Woman woman) {
		System.out.println("Woman gives Success to singer");
		
	}

}
