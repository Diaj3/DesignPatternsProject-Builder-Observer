package builderPattern;

public class FigurineMakerDirector {
	
	private FigurineBuilder figurineBuilder;
	
	public FigurineMakerDirector(FigurineBuilder figurineBuilder) {
		this.figurineBuilder = figurineBuilder;
	}
	
	public void buildFigurine() {
		this.figurineBuilder.buildAccessories();
		this.figurineBuilder.buildBody();
		this.figurineBuilder.buildClothes();
		this.figurineBuilder.buildEyes();
		this.figurineBuilder.buildHair();
		this.figurineBuilder.buildHead();
	}
	
	public String getFigurineInfo() {
		return this.figurineBuilder.getFigurine();
	}
}
