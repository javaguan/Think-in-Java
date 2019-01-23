package chapter5;

import java.util.Arrays;
import java.util.Random;



public class ArrayNew {
	public static void main(String[] args) {

Random random=new Random(47);
int c=random.nextInt(5);//产生一个伪随机数，值为0到5中的一个，取值由种子决定
int[]array=new int[c];
System.out.println(Arrays.toString(array));
	
}
}