package chapter10;


public class Parcel7 {
	public Contents contents() {
		return new Contents(){//Contents()�������������{ }���ڿ��ڶ��������ڲ���
			private int i=11;
		   public int value() {return i;}    
		};//����;��ʾ�˾����
	}
public static void main(String[] args) {
	Parcel7 parcel7=new Parcel7();
	Contents contents=parcel7.contents();
	
}
}
