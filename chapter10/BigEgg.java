package chapter10;
class Egg{
	private Yolk y;
	protected class Yolk{
		public Yolk(){System.out.println("Egg.Yolk()");}
	}
}
public class BigEgg extends Egg {

public class Yolk{
	public Yolk() {System.out.println("Egg2.Yolk()");}
}
public static void main(String[] args) {
	new BigEgg();
}
}//����
//��������ڡ���ȷ�Ĺ�ϵ����������ڲ����븸����ڲ���Ϊ����������ʵ��
//��BigEgg2