package SnakeladderGame;

public class Main {
	public static void main(String[] args) {
		Game g = new Game(new Board(100));
		g.addPlayer(new Player("RAM"));
		g.addPlayer(new Player("SHAM"));
		
		g.start();
	}
}