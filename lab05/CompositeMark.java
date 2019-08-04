package unsw.enrolment;

import java.util.ArrayList;
import java.util.List;

public class CompositeMark extends MarkComponent {
	
	CalculateMark calculator;
	
	private String description;
	private int fullmark;
	
	public CompositeMark(String description, int fullmark) {
		this.description = description;
		this.fullmark = fullmark;
	}

	private List<MarkComponent> markList = new ArrayList<>();
	
	@Override
	public boolean addMark(MarkComponent mark) {
		markList.add(mark);
		return true;
	}

	@Override
	public boolean removeMark(MarkComponent mark) {
		markList.remove(mark);
		return true;
	}

	@Override
	public String printMark() {
		String list = "[ ";
		for (MarkComponent mk : markList) {
			list += " " + mk.printMark();
		}
		list += " ]";
		return list;
	}

	public String getDescription() {
		return description;
	}

	public List<MarkComponent> getMarkList() {
		return markList;
	}

	@Override
	public double getMark() {
		calculator = new SumMark();
		double mark = calculator.calculating(this);
		return (mark);
	}
	
	public double getAverageMark() {
		calculator = new AverageMark();
		double mark = calculator.calculating(this);
		return mark;
	}

	
	

}
