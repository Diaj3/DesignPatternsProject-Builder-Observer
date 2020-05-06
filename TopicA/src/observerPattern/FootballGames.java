package observerPattern;

public interface FootballGames {
	public void register(Observer observer);
	public void unregister(Observer observer);
	public void notifyObersers();
}
