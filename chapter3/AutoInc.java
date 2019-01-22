package chapter3;



public class AutoInc {
	public static void main(String[] args) {
		int i=6;
		System.out.print(i++);
		System.out.println(i);//6,i=7
		System.out.print(++i);
		System.out.println(i);//8,i=8
		System.out.print(i--);//
		System.out.println(i);//8,i=7
		System.out.print(--i);//
		System.out.println(i);//6,i=6
	}

}
