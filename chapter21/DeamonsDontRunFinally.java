package chapter21;

public class DeamonsDontRunFinally {
public static void main(String[] args) throws Exception{
	Thread thread=new Thread(new aDeamon());
	thread.setDaemon(true);
	thread.start();
}
}
