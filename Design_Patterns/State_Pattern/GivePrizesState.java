package statePattern;

public class GivePrizesState implements State {
	
	Activity activity;
	
	public GivePrizesState(Activity activity) {
		this.activity = activity;
	}

	@Override
	public void deductPoints() {
		System.out.println("no point deduct at this stage!");
		
	}

	@Override
	public boolean raffle() {
		System.out.println("no raffle at this state");
		return false;
	}

	@Override
	public void givePrizes() {
		if (activity.getCount() > 0) {
			System.out.println("you can get your prize");
			activity.setState(activity.getRaffleDisable());
		} else {
			System.out.println(":( No More!");
			System.exit(0);
			activity.setState(activity.getEmptyPrizeState());
		}
		
	}

}
