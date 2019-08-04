package unsw.enrolment;

import java.util.List;

public abstract class MarkComponent {
	
	
	public abstract boolean addMark(MarkComponent mark);
	public abstract boolean removeMark(MarkComponent mark);
	public abstract String printMark();
	public abstract double getMark();
	public abstract double getAverageMark();
	
}
