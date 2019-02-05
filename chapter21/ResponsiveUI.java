package chapter21;

import java.io.IOException;

class UnResponsiveUI{
	private volatile double d=1;
	public UnResponsiveUI() throws IOException {
		while(d>0)
			d=d+(Math.PI+Math.E)/d;
		System.in.read();//�ӿ���̨��ȡ����һ���ַ���������ASCIIֵ
	}
}
public class ResponsiveUI extends Thread{
private static volatile double d=1;
public ResponsiveUI() {
	setDaemon(true);
	start();
}
public void run() {
	while(true)d=d+(Math.PI+Math.E)/d;
}
public static void main(String[] args) throws Exception {
	//new UnResponsiveUI();
	System.out.println("dfsdf");
	new ResponsiveUI();//һ����̨�߳�
	
	System.out.println(System.in.read());//��ӡ�ӿ���̨�����ASCII��ֵ
	System.out.println(d);

}
}
