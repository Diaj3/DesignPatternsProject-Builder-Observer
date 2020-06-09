package observerPattern;

public interface GamesInfoInterface {
	public void register(Observer observer);
	public void unregister(Observer observer);
	public void notifyObersers();
}
