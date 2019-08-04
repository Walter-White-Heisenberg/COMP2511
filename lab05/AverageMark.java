package unsw.enrolment;

public class AverageMark implements CalculateMark {
	@Override
	public double calculating(CompositeMark mark) {
		double sum = 0;
		for (MarkComponent mk : mark.getMarkList()) {
			sum += mk.getMark();
		}
		return sum/(mark.getMarkList().size());
	}
	
	
}

