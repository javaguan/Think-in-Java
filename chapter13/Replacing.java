package chapter13;
//正则表达式在String类的运用————替换
public class Replacing {
	static String string=Sliptting.knights;
	public static void main(String[] args) {
		System.out.println(string.replaceFirst("n\\W+", "Local"));
		System.out.println(string.replaceAll("you|the","one"));
	}

}
