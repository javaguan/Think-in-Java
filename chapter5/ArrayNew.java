package chapter5;

import java.util.Arrays;
import java.util.Random;



public class ArrayNew {
	public static void main(String[] args) {

Random random=new Random(47);
int c=random.nextInt(5);//����һ��α�������ֵΪ0��5�е�һ����ȡֵ�����Ӿ���
int[]array=new int[c];
System.out.println(Arrays.toString(array));
	
}
}