package chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExperssion {
public static void main(String[] args) {
	String []arrrg=new String[] {"abcabcabcdegabc","abc+","(abc)+","(abc){2,}"};
	//(abc){2,}ƥ����������������(abc)����ַ���
	System.out.println("Input:\""+arrrg[0]+"\"");
	//����\"��ʾ",\Ϊת��б��,��ֹ""�ڵ�"�ַ������ⲿ˫���Ų�������
	for(String arg:arrrg) {
		System.out.println("Regular expression:\""+arg+"\"");
		Pattern pattern=Pattern.compile(arg);
		Matcher matcher=pattern.matcher(arrrg[0]);
		while(matcher.find()) {
			System.out.println("Match\""+matcher.group()+"\" at positions "+matcher.start()+"-"+(matcher.end()-1));
		}
	}
}
}
