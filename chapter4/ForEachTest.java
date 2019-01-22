package chapter4;

public class ForEachTest {
	public static void main(String[] args) {
		int []array=new int[] {2,1,4,3,6,5,8,7,0,9};
		for(int a:array)System.out.print(a+"  ");/*把array[0]
	的值赋给a，执行一次循环，再把array[1]...执行一次循环...array[2]...
		最后把数组中最后一个元素赋给a，执行一次循环后，跳出循环
	*/
		System.out.println("");
		for(char c:"abcdefghiABCDEFGHI".toCharArray()) System.out.print(c+" ");
	}

}
