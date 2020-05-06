package observerPattern;

import java.util.Hashtable;

public interface Observer {
	public void update(int homeTeamGoals, int outsideTeamGoals, String game_time,
			Hashtable<String, String> homeTeam_goal_scorer, Hashtable<String, String> outsideTeam_goal_scorer,
			int yellowCards, int redCards);
}
