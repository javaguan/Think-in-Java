package chapter16;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfGenerics {
@SuppressWarnings("unchecked")
public static void main(String [] args) {
	List<String>[] ls;
	List[] la=new List[10];
	ls=(List<String>[])la;
	ls[0]=new ArrayList<>();
	Object[]objects=ls;//����ת��
	
	
}
}