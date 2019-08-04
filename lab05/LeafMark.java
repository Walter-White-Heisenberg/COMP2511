package unsw.enrolment;

import java.util.List;

public class LeafMark extends MarkComponent{
	
	String description;
	double mark;
	int fullmark;

	public LeafMark(String description, double mark, int fullmark) {
		this.fullmark = fullmark;
		this.description = description;
		this.mark = mark;
	}

	@Override
	public boolean addMark(MarkComponent mark) {
		return false;
	}

	@Override
	public boolean removeMark(MarkComponent mark) {
		return false;
	}

	@Override
	public String printMark() {
		return " " + description + " " + mark;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getMark() {
		return (mark);
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	@Override
	public double getAverageMark() {
		// TODO Auto-generated method stub
		return 0;
	}


}
