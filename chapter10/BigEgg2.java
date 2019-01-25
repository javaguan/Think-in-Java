package chapter10;


class Egg2{
	protected class Yolk{
		public Yolk() {System.out.println("Egg2");}
		public void f() {System.out.println("Egg2.f()");}
	}
	private Yolk y=new Yolk();
	public Egg2() {System.out.println("new Egg2");}
	public void insertYolk(Yolk yy) {y=yy;}
	public void g() {y.f();}
}
public class BigEgg2 extends Egg2 {
	public class Yolk extends Egg2.Yolk{
		public Yolk() {System.out.println("BigEgg2.Yolk");}
		public void f() {System.out.println("BigEgg2.Yolk.f()");}
	}
	public BigEgg2() {insertYolk(new Yolk());}
	public static void main(String[] args) {
		Egg2 egg2=new BigEgg2();
		egg2.g();
	}
}
