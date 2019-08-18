package statePattern;

import java.util.Random;

public class CanRaffleState implements State{
	Activity activity;
	
	
	
	public CanRaffleState(Activity activity) {
		this.activity = activity;
	}

	@Override
	public void deductPoints() {
		System.out.println("points has already been deducted");
		
	}

	@Override
	public boolean raffle() {
		System.out.println("raffle - ing...");
		Random r = new Random();
		// get a random number from 0..9
		int num = r.nextInt(10);
		if (num == 0) {
			System.out.println("lucky!!");
			activity.setState(activity.getGivePrizesState());
			return true;
		} else {
			System.out.println("try again!");
			activity.setState(activity.getRaffleDisable());
			return false;
		}
	}

	@Override
	public void givePrizes() {
		System.out.println("this is raffle-ing state!");
		
	}

}
