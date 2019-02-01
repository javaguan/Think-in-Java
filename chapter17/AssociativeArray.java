package chapter17;

import java.awt.image.RescaleOp;
import java.nio.charset.MalformedInputException;

//map利用二维数组Object[][2]实现
public class AssociativeArray <K,V>{
	private Object[][]pairs;
	private int index;
	public AssociativeArray(int length) {
		pairs=new Object[length][2];
	}
	public void put(K key,V value) {
		if(index>=pairs.length)throw new ArrayIndexOutOfBoundsException();
		pairs[index++]=new Object[] {key,value};
	}
@SuppressWarnings("unchecked")
public V get(K key) {
	for(int i=0;i<pairs.length;i++) {
		if(key.equals(pairs[i][0]))
			return (V)pairs[i][1];
		
	}
	return null;
	
}
public String toString() {
	StringBuilder builder=new StringBuilder();
	for(int i=0;i<pairs.length;i++) {
		builder.append(pairs[i][0].toString());
		builder.append(":");
		builder.append(pairs[i][1].toString());
		if(i<index-1)builder.append("\n");
	}
	   return builder.toString();
}
public static void main(String[]args) {
	AssociativeArray<String, String>map=new AssociativeArray<>(6);
	map.put("sky", "blue");
	map.put("ocean", "dancing");
	map.put("earth", "brown");
	map.put("sun", "warn");
	map.put("tree", "tall");
	map.put("book", "interesting");
	try {
		map.put("extra", "Object");
	}catch (Exception e) {
		System.out.println("Too many");
	}
	System.out.println(map);
	System.out.println(map.get("book"));
}
}
