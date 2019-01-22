package chapter2;

public class ShowProperties {
	public static void main(String[] args) {
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("Java.library.path "));
	}

}
