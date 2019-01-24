package chapter7;
class Insect{
	private int i=9;
	protected int j;
	private int n=printInit("fifi");
	public Insect() {
		System.out.println("i="+i+",j="+j);
		j=39;
	}
	private static final int x1=printInit("static Insect.x1 initialized");
	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}
public class Beetle extends Insect {
	private int k=printInit("Beetle.k initialized");
	public Beetle() {
		System.out.println("k="+k);
		System.out.println("j="+j);
	}
private final static int x2=printInit("static Beetle.x2 initialized");
public static void main(String[] args) {
	System.out.println("Beetle's constructor");
	Beetle beetle=new Beetle();
	
	
}
}
//调用构造器时先初始化父类域，再调用父类构造器，再子类域，再子类构造器
