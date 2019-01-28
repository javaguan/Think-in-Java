package chapter11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {
public static void main(String[] args) {
	Random random=new Random();
	Map<Integer, Integer>map=new HashMap<>();
	int j;
	Integer k;
	for(int i=0;i<1000;i++) {
		j=random.nextInt(30);
	k=map.get(j);//此处返回值为Integer 或  null，基本类int k没有null值，只有Integer类有
		map.put(j,k==null?1:(++k) );//若把++k换成k++则k至多为1,because 先用后加这里没得加
	}
	System.out.println(map);
}
}
