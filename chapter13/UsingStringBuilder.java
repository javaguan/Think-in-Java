package chapter13;

import java.util.Random;

public class UsingStringBuilder {
public static Random random=new Random(47);
public String toString(){
	StringBuilder builder=new StringBuilder("["); 
	for(int i=0;i<20;i++) {
		builder.append(random.nextInt(100));
		builder.append(", ");
		
	}
	builder.delete(builder.length()-2, builder.length());
	builder.append("]");
	return builder.toString();
}
	public static void main(String[] args) {
		UsingStringBuilder usingStringBuilder=new UsingStringBuilder();
		System.out.println(usingStringBuilder.toString());
	}
}
