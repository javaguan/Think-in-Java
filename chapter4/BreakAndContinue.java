package chapter4;

public class BreakAndContinue {
	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
			if(i==74)break;//if(true)out of loop;
			if((i%9)!=0)continue;//if(true)back to top of loop and continue next loop
			System.out.print(i+"  ");
		}
	}

}
