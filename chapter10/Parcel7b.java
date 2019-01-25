package chapter10;

public class Parcel7b {//”Îparcet7µ»º€
	class MyContents extends Contents{
		private int i=11;
		public int value() {return i;}
	}
  public Contents contents() {return new MyContents();}
  public static void main(String[] args) {
	Parcel7b parcel7b=new Parcel7b();
	Contents contents=parcel7b.contents();
}
}
