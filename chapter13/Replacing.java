package chapter13;
//������ʽ��String������á��������滻
public class Replacing {
	static String string=Sliptting.knights;
	public static void main(String[] args) {
		System.out.println(string.replaceFirst("n\\W+", "Local"));
		System.out.println(string.replaceAll("you|the","one"));
	}

}
