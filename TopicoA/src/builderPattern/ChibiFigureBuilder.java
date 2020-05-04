package builderPattern;

public class ChibiFigureBuilder implements FigurineBuilder {
	
	Figurine figurine = new Figurine();
	
	public ChibiFigureBuilder () {
		this.figurine = figurine;
	}

	@Override
	public void buildEyes() {
		figurine.setEyes("big eyes");
	}

	@Override
	public void buildHead() {
		figurine.setHead("big head");;
	}

	@Override
	public void buildBody() {
		figurine.setBody("small structure");
	}

	@Override
	public void buildHair() {
		figurine.setHair("medium to long");
	}

	@Override
	public void buildClothes() {
		figurine.setClothes("Fully clothed");
	}

	@Override
	public void buildAccessories() {
		figurine.setAccessories("oversized items");
	}

	@Override
	public String getFigurine() {
		return figurine.toString();
	}

}
