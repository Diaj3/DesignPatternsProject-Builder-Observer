package observerPattern;

public interface Observer {
	public void update(int homeTeamGoals, int outsideTeamGoals, String game_time,
			String homeTeam_goal_scorer, String outsideTeam_goal_scorer,
			int yellowCards, int redCards);
}
