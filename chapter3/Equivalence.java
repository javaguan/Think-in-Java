package chapter3;

public class Equivalence {
	public static void main(String[] args) {
		int[]two=new int[2];
		System.out.println(two[0]==two[1]);
		System.out.println(two[0]!=two[1]);//int�����Ĭ��ֵ0�����ַΨһ
		System.out.println("=====");
		int x=456;
		int y=456;
		System.out.println(x==y);//ͬһ��int���ִ����ַ��ͬ
		Integer i=new Integer(99);
		Integer j=new Integer(99);
		System.out.println(i==j);//i,j������ͬ������ͬһ���󣬴����ַ��ͬ��fause
		Integer kInteger=i;
		System.out.println(kInteger==i);//k��i������ͬһ����true
		System.out.println(i.equals(j));
	}

}
