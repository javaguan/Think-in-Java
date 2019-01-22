package chapter3;

public class Equivalence {
	public static void main(String[] args) {
		int[]two=new int[2];
		System.out.println(two[0]==two[1]);
		System.out.println(two[0]!=two[1]);//int数组的默认值0储存地址唯一
		System.out.println("=====");
		int x=456;
		int y=456;
		System.out.println(x==y);//同一个int数字储存地址相同
		Integer i=new Integer(99);
		Integer j=new Integer(99);
		System.out.println(i==j);//i,j内容相同但不是同一对象，储存地址不同，fause
		Integer kInteger=i;
		System.out.println(kInteger==i);//k和i引用了同一对象true
		System.out.println(i.equals(j));
	}

}
