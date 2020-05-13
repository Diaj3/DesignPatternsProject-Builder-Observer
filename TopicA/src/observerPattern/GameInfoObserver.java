package observerPattern;


public class GameInfoObserver implements Observer{
	
	private int homeTeamGoals;
	private int outsideTeamGoals;
	private String game_time;
	private String homeTeam_goal_scorer;
	private String outsideTeam_goal_scorer;
	private int yellowCards;
	private int redCards;
	
	private static int objID = 0;
	private int ID;
	private String company_name;
	
	private GamesInfoInterface footballgames;
	
	public GameInfoObserver(GamesInfoInterface footballgames, String name) {
		this.footballgames = footballgames;
		this.ID = ++objID;
		this.company_name = name;
		System.out.println("New Observer: " + name + ", ID: " + this.ID);
		footballgames.register(this);
	}
	

	public void update(int homeTeamGoals, int outsideTeamGoals, String game_time,
			String homeTeam_goal_scorer, String outsideTeam_goal_scorer,
			int yellowCards, int redCards) {
		// TODO Auto-generated method stub
		this.homeTeam_goal_scorer = homeTeam_goal_scorer;
		this.outsideTeamGoals = outsideTeamGoals;
		this.homeTeamGoals = homeTeamGoals;
		this.outsideTeam_goal_scorer = outsideTeam_goal_scorer;
		this.game_time = game_time;
		this.yellowCards = yellowCards;
		this.redCards = redCards;
	}
	
	public void printStats() {
		System.out.println("Company: " + company_name + " [Home Score: " + homeTeamGoals
				+ ", Outside Team Score: " + outsideTeamGoals + ", Recent home Scorer: " + homeTeam_goal_scorer
				+ ", Recent outside Team Scorer: " + outsideTeam_goal_scorer + ", Red Cards: " + redCards
				+ ", Yellow Cards: " + yellowCards + ", Game Time: " + game_time + "]");
	}

}
