package chapter3;

import java.util.Random;

public class RandomSetSeed {
	public static void main(String[] args) {
		
		Random random=new Random(47);//其中47为随机数生成器的初始化值，
		//等价于Random random=new Random();random.setSeed(47);
		int unKnown=random.nextInt();
		System.out.println(unKnown);//随机器的种子相同，生成的随机数也相同
	}

}
