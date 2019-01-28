package chapter11;

import java.util.Iterator;
 

public class IterableClass  implements Iterable<String> {;
	protected   String []words=("one two three four" +" five six seven eight nine ten").split(" ");
public Iterator<String> iterator(){
	return new Iterator<String>() {
		private int index=0;
		public boolean hasNext() {return index<words.length;}
		public String next() {return words[index++];}//先用后加
	   public void remove() { throw new UnsupportedOperationException();}//数组如何remove呢，此处没有写出具体的方法体
	};
}
public static void main(String[] args) {
	for(String s:new IterableClass()) {System.out.println(s);}
}
}
