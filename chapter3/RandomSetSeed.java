package chapter3;

import java.util.Random;

public class RandomSetSeed {
	public static void main(String[] args) {
		
		Random random=new Random(47);//����47Ϊ������������ĳ�ʼ��ֵ��
		//�ȼ���Random random=new Random();random.setSeed(47);
		int unKnown=random.nextInt();
		System.out.println(unKnown);//�������������ͬ�����ɵ������Ҳ��ͬ
	}

}
