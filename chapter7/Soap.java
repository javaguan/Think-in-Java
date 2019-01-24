package chapter7;

public class Soap {
	private String string;
	public Soap() {
		System.out.println(string);
		string="Hello!";
		System.out.println(string);
	}
	public static void main(String[] args) {
		new Soap();
	}

}
