package chapter7;

public class BlankFinal {
	private final int j;
	public BlankFinal(){
		j=1;
		System.out.println(j);
	}
public static void main(String[] args) {
	new BlankFinal();
}
}
/*final û�������г�ʼ��������blank final��������ÿ��constructor�г�ʼ����
//final must be initialized!
//final ���η���������Ĳ���ʱ����ζ�Ų���������ָ��Ķ����޷���
 * ���ģ�ָ����һ�����󣩻�������õ�ֵ���������ͣ����ܱ�����
 
*/