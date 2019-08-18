package statePattern;

public class RaffleDisable implements State {

	
	Activity activity;
	
	
	public RaffleDisable(Activity activity) {
		this.activity = activity;
	}

	@Override
	public void deductPoints() {
		System.out.println("the point has veen deducted, now you can raffle");
		activity.setState(activity.getCanRaffleState());
		
	}

	@Override
	public boolean raffle() {
		System.out.println("now its RaffleDisable state, you cannot raffle");
		return false;
	}

	@Override
	public void givePrizes() {
		System.out.println("no prizes in this state");
		
	}

}
