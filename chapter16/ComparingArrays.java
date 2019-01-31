package chapter16;

import java.util.Arrays;

public class ComparingArrays {
	public static void main(String[] args) {
		int[]a1=new int[10];
		int[]a2=new int[10];
		Arrays.fill(a1,47);
		Arrays.fill(a2,47);
		System.out.println(Arrays.equals(a1, a2));//Arrays.equals比较的a1和a2的元素个数与每个元素
		System.out.println(a1.equals(a2));//这里比较的是a1和a2的地址
		a2[3]=11;
		System.out.println(Arrays.equals(a1                                                         , a2));
	}
		

}
