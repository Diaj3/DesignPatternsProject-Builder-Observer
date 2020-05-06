package builderPattern;

public class Client {

	public static void main(String[] args) {
		FigurineBuilder humanoidBuilder = new HumanoidFigureBuilder();
		FigurineBuilder monsterBuilder = new MonsterFigureBuilder();
		FigurineBuilder chibiBuilder = new ChibiFigureBuilder();
		
		FigurineMakerDirector figurineMaker = new FigurineMakerDirector(humanoidBuilder);
		figurineMaker.buildFigurine();
		System.out.println("Humanoid Figurine info: " + figurineMaker.getFigurineInfo());
		
		
		FigurineMakerDirector monsterMaker = new FigurineMakerDirector(monsterBuilder);
		monsterMaker.buildFigurine();
		System.out.println("Monster Figurine info: " + monsterMaker.getFigurineInfo());
		
		FigurineMakerDirector chibiMaker = new FigurineMakerDirector(chibiBuilder);
		chibiMaker.buildFigurine();
		System.out.println("Chibi Figurine info: " + chibiMaker.getFigurineInfo());
	}

}
