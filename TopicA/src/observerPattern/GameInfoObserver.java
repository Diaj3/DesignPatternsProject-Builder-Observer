package observerPattern;

import java.util.Hashtable;

public class GameInfoObserver implements Observer{
	
	private int homeTeamGoals;
	private int outsideTeamGoals;
	private String game_time;
	private Hashtable<String, String> homeTeam_goal_scorer;
	private Hashtable<String, String> outsideTeam_goal_scorer;
	private int yellowCards;
	private int redCards;
	
	private static int objID = 0;
	private int ID;
	
	private FootballGames footballgames;
	
	public GameInfoObserver(FootballGames footballgames) {
		this.footballgames = footballgames;
		this.ID = ++objID;
		System.out.println("New Observer " + this.ID);
		footballgames.register(this);
	}
	

	public void update(int homeTeamGoals, int outsideTeamGoals, String game_time,
			Hashtable<String, String> homeTeam_goal_scorer, Hashtable<String, String> outsideTeam_goal_scorer,
			int yellowCards, int redCards) {
		// TODO Auto-generated method stub
		this.homeTeam_goal_scorer = homeTeam_goal_scorer;
		this.outsideTeamGoals = outsideTeamGoals;
		this.homeTeamGoals = homeTeamGoals;
		this.outsideTeam_goal_scorer = outsideTeam_goal_scorer;
		this.game_time = game_time;
		this.yellowCards = yellowCards;
		this.redCards = redCards;
		
		printStats();
		
	}
	
	public void printStats() {
		System.out.println("ID: " + ID + ": Home Score: " + homeTeamGoals
				+ ", Outside Team Score: " + outsideTeamGoals + ", Home Scorers: " + homeTeam_goal_scorer
				+ ", Outside Team Scorers: " + outsideTeam_goal_scorer + ", Red Cards: " + redCards
				+ ", Yellow Cards: " + yellowCards + ", Game Time: " + game_time);
	}

}
