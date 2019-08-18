package statePattern;

public class EmptyPrizeState implements State {
	Activity activity;
	
	
	public EmptyPrizeState(Activity activity) {
		super();
		this.activity = activity;
	}

	@Override
	public void deductPoints() {
		System.out.println("no more prize sorry!");
		
	}

	@Override
	public boolean raffle() {
		System.out.println("no more prize sorry!");
		return false;
	}

	@Override
	public void givePrizes() {
		System.out.println("no more prize sorry!");
		
	}

}
