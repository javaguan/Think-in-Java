package chapter4;

import java.util.Random;



public class SwitchTest {
	public static void main(String[] args) {
		Random random=new Random(47);
		for(int i=0;i<100;i++) {
			int c=random.nextInt(27)+'a';
			System.out.print((char) c+":  ");
		switch(c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':System.out.println("vowel;");
		break;
		default:System.out.println("consonant;");
		}
		}
	}

}
