package chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExperssion {
public static void main(String[] args) {
	String []arrrg=new String[] {"abcabcabcdegabc","abc+","(abc)+","(abc){2,}"};
	//(abc){2,}匹配两个以上连续的(abc)块的字符串
	System.out.println("Input:\""+arrrg[0]+"\"");
	//这里\"表示",\为转义斜杠,防止""内的"字符串与外部双引号产生干扰
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
