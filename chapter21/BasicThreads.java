package chapter21;

public class BasicThreads {
public static void main(String[] args) {
	Thread thread =new Thread(new LiffOff());
	thread.start();
	System.out.println("Waiting for LiffOff");//����ָ��ִ������ִ����Thread�е�����
}
}
