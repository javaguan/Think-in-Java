package chapter11;

import java.util.PriorityQueue;
import java.util.Random;



public class PriorityQueueTest {
public static void main(String[] args) {
	PriorityQueue<Integer>priorityQueue=new PriorityQueue<Integer>(); 
	Random random=new Random();
	for(int i=0;i<10;i++) {
		priorityQueue.offer(random.nextInt(i+1));

	}
	for(int a:priorityQueue) {System.out.println(a);}//foreachû�����ȼ���foreach����ʵ�֡�������
while(!priorityQueue.isEmpty()) {
	System.out.println(priorityQueue.remove());//remove�����ȼ�
}
}
}
