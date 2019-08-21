package MovieRenting;

public class ChildrensMovie extends Movies {

	public ChildrensMovie(int days) {
		super(days);
		setDescription("this is childrens movie");
		costMethod = new CostMethod1();
	}
	

}
