package chapter12;

public class FinallyWorks {
static int count =0;
public static void main(String[] args) {
	try {
		
		return;//try catch�����returnҲ��ֹ����finally���ִ��
	
	}
	finally {
		
		System.out.println("must done");
		//finally�����׳��쳣�Ḳ��ǰ����ֵ��쳣��finally����return�ᶪʧǰ����쳣
	}
}
	
	
}
