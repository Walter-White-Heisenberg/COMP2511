package template_video;

public class Client {

	public static void main(String[] args) {
	
		System.out.println("===========making redbean soy milk============");
		SoyMilk redbean = new RedBeanSoyMilk();
		redbean.make();
		
		
		System.out.println("===========making pennut soy milk============");
		SoyMilk pennut = new PennutSoyMilk();
		pennut.make();
		
		
		System.out.println("===========making normal soy milk============");
		SoyMilk normal = new NormalSoyMilk();
		normal.make();
		
		
		
		
	}

}
