package chapter10;
class Egg{
	private Yolk y;
	protected class Yolk{
		public Yolk(){System.out.println("Egg.Yolk()");}
	}
}
public class BigEgg extends Egg {

public class Yolk{
	public Yolk() {System.out.println("Egg2.Yolk()");}
}
public static void main(String[] args) {
	new BigEgg();
}
}//不对
//如果不存在“明确的关系”，基类的内部类与父类的内部类为两个独立的实体
//见BigEgg2