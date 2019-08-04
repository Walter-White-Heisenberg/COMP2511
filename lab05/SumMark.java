package unsw.enrolment;

public class SumMark implements CalculateMark {
	@Override
	public double calculating(CompositeMark mark) {
		double sum = 0;
		for (MarkComponent mk : mark.getMarkList()) {
			sum += mk.getMark();
		}
		return sum;
	}



}
