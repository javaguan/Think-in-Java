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
	k=map.get(j);//�˴�����ֵΪInteger ��  null��������int kû��nullֵ��ֻ��Integer����
		map.put(j,k==null?1:(++k) );//����++k����k++��k����Ϊ1,because ���ú������û�ü�
	}
	System.out.println(map);
}
}
