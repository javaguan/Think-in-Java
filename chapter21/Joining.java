package chapter21;

import java.awt.print.PrinterGraphics;

class Sleeper extends Thread{
	private int duration;
	public Sleeper(String name,int sleepTime) {
		super(name);
		duration=sleepTime;
        start();
	}
	public void run() {
		try {sleep(duration);
			
		}catch (Exception e) {
			System.out.println(getName()+"was Interrupted. "+isInterrupted());
			return;
		}
		System.out.println(getName()+"was awakened");
		}
}
class Join extends Thread {
	private Sleeper sleeper;
	public Join(String name,Sleeper sleeper) {
		super(name);
		this.sleeper=sleeper;
		start();
	}
	public void run() {
		try {
			sleeper.join();
			}catch (Exception e) {
				System.out.println("Interrupted");
			}
    System.out.println(getName()+"join completed");
	}
}
public class Joining {
	public static void main(String[] args) {
		Sleeper sleepy=new Sleeper("sleepy", 1500);
		Sleeper Grumpy=new Sleeper("Grumpy", 1500);
		Join join1=new Join("join1", sleepy);
		Join join2=new Join("join2", Grumpy);
		Grumpy.interrupt();
	}
	

}
