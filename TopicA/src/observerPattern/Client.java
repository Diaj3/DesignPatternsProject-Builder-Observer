package observerPattern;

public class Client {

	public static void main(String[] args) {
		System.out.println("### Observer Design Pattern Example ### ");
		
		FootballGamesInfo gameInfo = new FootballGamesInfo();
		GameInfoObserver betclick = new GameInfoObserver(gameInfo, "betclick");
		
		gameInfo.setGame_time("57:00");
		gameInfo.setOutsideTeamGoals(1);
		gameInfo.setOutsideTeam_goal_scorer("Quaresma");
		betclick.printStats();
		
		gameInfo.unregister(betclick);
		
		gameInfo.setGame_time("89:00");
		gameInfo.setYellowCards(1);
		betclick.printStats();
	}

}
