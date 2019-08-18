package statePattern;

public class Activity {
	State state;
	int count;
	
	// all the states
	State raffleDisable = new RaffleDisable(this);
	State canRaffleState = new CanRaffleState(this);
	State givePrizesState = new GivePrizesState(this);
	State emptyPrizeState = new EmptyPrizeState(this);

	public Activity(int count) {
		this.state = raffleDisable;
		this.count = count;
	}

	public void deductPoints() {
		state.deductPoints();
	}
	
	public void raffle() {
		if (state.raffle()) {
			state.givePrizes();
		}
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getCount() {
		// everytime get prize, the count should --
		int newcount = count;
		newcount--;
		return newcount;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public State getRaffleDisable() {
		return raffleDisable;
	}

	public void setRaffleDisable(State raffleDisable) {
		this.raffleDisable = raffleDisable;
	}

	public State getCanRaffleState() {
		return canRaffleState;
	}

	public void setCanRaffleState(State canRaffleState) {
		this.canRaffleState = canRaffleState;
	}

	public State getGivePrizesState() {
		return givePrizesState;
	}

	public void setGivePrizesState(State givePrizesState) {
		this.givePrizesState = givePrizesState;
	}

	public State getEmptyPrizeState() {
		return emptyPrizeState;
	}

	public void setEmptyPrizeState(State emptyPrizeState) {
		this.emptyPrizeState = emptyPrizeState;
	}


	
	
}
