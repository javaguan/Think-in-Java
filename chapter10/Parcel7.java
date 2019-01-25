package chapter10;


public class Parcel7 {
	public Contents contents() {
		return new Contents(){//Contents()构造器后面加上{ }，在块内定义匿名内部类
			private int i=11;
		   public int value() {return i;}    
		};//加上;表示此句结束
	}
public static void main(String[] args) {
	Parcel7 parcel7=new Parcel7();
	Contents contents=parcel7.contents();
	
}
}
