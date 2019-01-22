package chapter2;

public class AStringLength {
	public static void main(String[] args) {
		String s1="s";
		String s2="one";
		System.out.println(storage(s1));
		System.out.println(storage(s2));
		
	}
	public static int storage(String s) {
		return s.length();//String类中有length方法，数组集合等中为length变量
	}

}
