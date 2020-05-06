package observerPattern;

public class Client {

	public static void main(String[] args) {
		System.out.println("Observer Design Pattern");
		
		FootballGamesInfo gameInfo = new FootballGamesInfo();
		
		GameInfoObserver betPT = new GameInfoObserver(gameInfo);
		GameInfoObserver betclick = new GameInfoObserver(gameInfo);
		
		
		gameInfo.setGame_time("57:00");
		
		GameInfoObserver betano = new GameInfoObserver(gameInfo);
	}

}
