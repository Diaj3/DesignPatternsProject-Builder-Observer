package builderPattern;

public class HumanoidFigureBuilder implements FigurineBuilder {
	
	Figurine figurine = new Figurine();

	public HumanoidFigureBuilder() {
		this.figurine = figurine;
	}

	@Override
	public void buildEyes() {
		figurine.setEyes("average size");
	}

	@Override
	public void buildHead() {
		figurine.setHead("average size");
	}

	@Override
	public void buildBody() {
		figurine.setBody("fit model");
	}

	@Override
	public void buildHair() {
		figurine.setHair("small to medium length");
	}

	@Override
	public void buildClothes() {
		figurine.setClothes("Fully clothed");
	}

	@Override
	public void buildAccessories() {
		figurine.setAccessories("Weapon");
	}

	@Override
	public String getFigurine() {
		return figurine.toString();
	}
}
