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
			//当collection发生改变后，使用修改前创建的迭代器会发生异常（错误），必须更新迭代器
		}catch(Exception e)
		{System.out.println(e);
			}
		}
		

}
