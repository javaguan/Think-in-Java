package chapter10;


class Factory{public Factory getGame() {
	return null;} }
class Chess extends Factory{
	public static Factory factory=new Factory() 
	{public Factory getGame(){return new Chess(); }};//static anonymous Inner class use;
}
public class Games {
Factory factory=Chess.factory;
Chess chess=(Chess)factory.getGame();

}
