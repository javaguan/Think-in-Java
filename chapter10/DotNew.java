package chapter10;

public class DotNew {
	public class Inner{//��DotThis.Inner��������ͻ
		Inner(){System.out.println("inner");}
	}
	public static void main(String[] args) {
		DotNew dotNew=new DotNew();
		DotNew.Inner inner=dotNew.new Inner();
	}
	

}
