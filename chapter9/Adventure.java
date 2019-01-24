package chapter9;

public class Adventure {
	public static void t(CanFight s) {s.fight();}
	public static void m(CanSwim s) {s.swim();}
	public static void u(CanFly s) {s.fly();}
    public static void o(ActionCharacter a) {a.fight();}
    public static void main(String[] args) {
		Hero hero=new Hero();
		t(hero); 
		m(hero);
		u(hero);
		o(hero);
		
	}
}
