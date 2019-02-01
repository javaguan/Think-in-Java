package chapter17;

import java.util.PriorityQueue;

import javax.print.attribute.standard.MediaName;

public class ToDoList extends PriorityQueue<ToDoList.ToDoItem>{
	static class ToDoItem implements Comparable<ToDoItem>{
		private char primary;
		private int secondary;
		private String item;
		public ToDoItem(String it,char pri,int sec) {
			this.primary=pri;
			this.secondary=sec;
			this.item=it;
		}
		public int compareTo(ToDoItem item) {
			if(primary>item.primary)return +1;
			if(primary==item.primary)
				if(secondary>item.secondary)return 1;
				else if(secondary==item.secondary)return 0;
				 return -1;//²»¼Óelse
		}
		public String toString() {
			return Character.toString(primary)+secondary+": "+item;
		}
		
	}
public void add(String ingstr,char c,int i) {
	super.add(new ToDoItem(ingstr, c, i));
}
public static void main(String[] args) {
	ToDoList toDoList=new ToDoList();

	toDoList.add("Em",'C',4);
	toDoList.add("Fee",'A',2);
	toDoList.add("Mo",'B',7);
	toDoList.add("Wa",'C',3);
	toDoList.add("FEE",'A',1);
	toDoList.add("Ep",'C',1);
	while(!toDoList.isEmpty()) {
		System.out.println(toDoList.remove());
	}
	
}
}
