package observerPattern;

import java.util.ArrayList;
import java.util.Hashtable;

public class FootballGamesInfo implements FootballGames{
	
	private ArrayList<Observer> observers;
	private int homeTeamGoals;
	private int outsideTeamGoals;
	private String game_time;
	private Hashtable<String, String> homeTeam_goal_scorer;
	private Hashtable<String, String> outsideTeam_goal_scorer;
	private int yellowCards;
	private int redCards;
	
	public FootballGamesInfo() {
		observers = new ArrayList<Observer>();
	}
	

	@Override
	public void register(Observer observer) {
		observers.add(observer);
		System.out.println("Observer " + observer + " was added!");
	}

	@Override
	public void unregister(Observer observer) {
		int o = observers.indexOf(observer);
		observers.remove(o);
		
		System.out.println("Observer " + observer + " was removed!");
	}

	@Override
	public void notifyObersers() {
		for(Observer observer : observers) {
			observer.update(homeTeamGoals, outsideTeamGoals, game_time,
					homeTeam_goal_scorer, outsideTeam_goal_scorer,
					yellowCards, redCards);
		}
	}


	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
		notifyObersers();
	}


	public void setHomeTeamGoals(int homeTeamGoals) {
		this.homeTeamGoals = homeTeamGoals;
		notifyObersers();
	}


	public void setOutsideTeamGoals(int outsideTeamGoals) {
		this.outsideTeamGoals = outsideTeamGoals;
		notifyObersers();
	}


	public void setGame_time(String game_time) {
		this.game_time = game_time;
		notifyObersers();
	}


	public void setHomeTeam_goal_scorer(Hashtable<String, String> homeTeam_goal_scorer) {
		this.homeTeam_goal_scorer = homeTeam_goal_scorer;
		notifyObersers();
	}


	public void setOutsideTeam_goal_scorer(Hashtable<String, String> outsideTeam_goal_scorer) {
		this.outsideTeam_goal_scorer = outsideTeam_goal_scorer;
		notifyObersers();
	}


	public void setYellowCards(int yellowCards) {
		this.yellowCards = yellowCards;
		notifyObersers();
	}


	public void setRedCards(int redCards) {
		this.redCards = redCards;
		notifyObersers();
	}
	
	
}
