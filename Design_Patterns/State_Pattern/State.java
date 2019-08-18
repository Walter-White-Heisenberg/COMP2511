package statePattern;

public interface State {
	
	// State是一个状态接口， 定义这个整个活动中所有的动作/operation
	
	public abstract void deductPoints();
	
	public abstract boolean raffle();
	
	public abstract void givePrizes();
	

}
