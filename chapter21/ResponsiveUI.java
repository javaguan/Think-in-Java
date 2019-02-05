package chapter21;

import java.io.IOException;

class UnResponsiveUI{
	private volatile double d=1;
	public UnResponsiveUI() throws IOException {
		while(d>0)
			d=d+(Math.PI+Math.E)/d;
		System.in.read();//从控制台读取输入一个字符，返回其ASCII值
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
	new ResponsiveUI();//一个后台线程
	
	System.out.println(System.in.read());//打印从控制台输入的ASCII码值
	System.out.println(d);

}
}
