package chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReFlags {
	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("^java",Pattern.CASE_INSENSITIVE|Pattern.MULTILINE);
		//���Դ�Сд�����ģʽ�൱��������ʽ��(?x)(?m)
		Matcher matcher=pattern.matcher(
				"java hadkf javA\nJAVA"
				+ "\nJaVa"
						);
		while(matcher.find()) {
			System.out.println(matcher.group());
		} 
	}

}
