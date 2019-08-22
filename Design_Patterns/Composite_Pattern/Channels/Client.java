package YoutubeChannels;

public class Client {

	public static void main(String[] args) {
		Youtube_Component mma = new Type_composite("MMA");
		Youtube_Component makeup = new Type_composite("makeup");
		
		mma.add(new Channels_leaf("UFC"));
		mma.add(new Channels_leaf("ESPN"));
		
		makeup.add(new Channels_leaf("Tati"));
		makeup.add(new Channels_leaf("NikkieTutorial"));
		makeup.add(new Channels_leaf("JeffreeStar"));
		
		Youtube_Component all = new Type_composite("youtube");
		all.add(makeup);
		all.add(mma);
		
		System.out.println(all.showComponents());

	}

}
