package chapter5;



public class PassingThis {
	public static void main(String[] args) {
		new Person().eat(new Apple());
	}

}

class Person{
	public void eat(Apple apple) {
		Apple peeled=apple.getPeeled();
		if(peeled==apple)System.out.println("Yummy");//add a statement to prove
	}
	
}
class Peeler{
	static Apple peel(Apple apple) {
		return apple;
	}
}
class Apple{
	Apple getPeeled() {return Peeler.peel(this);}
}
