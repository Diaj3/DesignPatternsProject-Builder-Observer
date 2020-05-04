package builderPattern;

public class MonsterFigureBuilder implements FigurineBuilder {
	
	private Figurine figurine;
	
	public MonsterFigureBuilder() {
		this.figurine = figurine;
	}

	@Override
	public void buildEyes() {
		figurine.setEyes("creepy style");
	}

	@Override
	public void buildHead() {
		figurine.setHead("average size");
	}

	@Override
	public void buildBody() {
		figurine.setBody("very muscular build");
	}

	@Override
	public void buildHair() {
		figurine.setHair("hairless");
	}

	@Override
	public void buildClothes() {
		figurine.setClothes("no clothes");
	}

	@Override
	public void buildAccessories() {
		figurine.setAccessories("spikes all over body");
	}

	@Override
	public String getFigurine() {
		return figurine.toString();
	}

}
