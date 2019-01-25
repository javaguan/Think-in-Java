package chapter10;

public class DotNew {
	public class Inner{//ÓëDotThis.InnerÃüÃû²»³åÍ»
		Inner(){System.out.println("inner");}
	}
	public static void main(String[] args) {
		DotNew dotNew=new DotNew();
		DotNew.Inner inner=dotNew.new Inner();
	}
	

}
