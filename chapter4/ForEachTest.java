package chapter4;

public class ForEachTest {
	public static void main(String[] args) {
		int []array=new int[] {2,1,4,3,6,5,8,7,0,9};
		for(int a:array)System.out.print(a+"  ");/*��array[0]
	��ֵ����a��ִ��һ��ѭ�����ٰ�array[1]...ִ��һ��ѭ��...array[2]...
		�������������һ��Ԫ�ظ���a��ִ��һ��ѭ��������ѭ��
	*/
		System.out.println("");
		for(char c:"abcdefghiABCDEFGHI".toCharArray()) System.out.print(c+" ");
	}

}
