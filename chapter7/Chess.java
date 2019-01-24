package chapter7;

public class Chess extends BoardGame{
	public  Chess() {
		super(2333);
	}
public static void main(String[] args) {
	new Chess();
	System.out.println("chess");
}
}
class Game{
	Game(int i){
		System.out.println(i);
		System.out.println("Game");
	}
}
class BoardGame extends Game{
	public BoardGame(int i) {
		super(i);
		System.out.println("BoardGame");
	}
}
