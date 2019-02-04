package chapter21;

public class BasicThreads {
public static void main(String[] args) {
	Thread thread =new Thread(new LiffOff());
	thread.start();
	System.out.println("Waiting for LiffOff");//这条指令执行完后才执行了Thread中的任务
}
}
