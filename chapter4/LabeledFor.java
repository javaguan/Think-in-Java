package chapter4;

public class LabeledFor {
	public static void main(String[] args) {
		int i=0;
		outer:
		for(;true;) {//省略了初始化和步进语句;判断语句为true的死循环
			inner://Can't have statements here;
				for(;i<10;i++) {
					System.out.println("i="+i);
					if(i==2) {
						System.out.print("continue");
					continue;
					}
					if(i==3) {
						System.out.println("break");
						i++;
						break;
					}
					if(i==7) {
						System.out.println("continue outer");
						i++;
						continue outer;
					}
					if(i==8) {
						System.out.println("break outer");
						i++;
						break outer;
					}
					for(int k=0;k<5;k++) {
						System.out.println("continue inner");
						continue inner;
					}
				}
		}
	}
//can't break or continue label here!
}
