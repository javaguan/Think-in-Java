package chapter17;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FailFast {
	public static void main(String[] args) {
		Collection<String>collection=new ArrayList<>();
		Iterator iterator=collection.iterator();
		collection.add("new Object");
		try {
			iterator.next();
			//��collection�����ı��ʹ���޸�ǰ�����ĵ������ᷢ���쳣�����󣩣�������µ�����
		}catch(Exception e)
		{System.out.println(e);
			}
		}
		

}
