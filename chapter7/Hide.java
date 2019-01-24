package chapter7;
class Homer{
	char doh(char c) {
		System.out.println("doh(char)");
	return 'v';
	}
	float doh(float c) {
		System.out.println("doh(float)");
	return 9.2f;
	}
}
class Milhouse{}
class Bart extends Homer{
	void doh(Milhouse m) {
		System.out.println("doh(Milhouse m)");
	}
}
public class Hide {
	public static void main(String[] args) {
		Bart bart=new Bart();
		bart.doh(5.6f);
		bart.doh('r');
		bart.doh(new Milhouse());
	}

}
