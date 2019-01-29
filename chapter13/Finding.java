package chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finding {
	public static void main(String[] args) {
		Matcher matcher=Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings");
		while(matcher.find()) {
			System.out.println(matcher.group()+" ");
	
		}
		int i=0;
		while(matcher.find(i)) {//i为被匹配的字符串转化为char数组后的索引;find(i)表示从"char[i]开始进行匹配"
		System.out.println(matcher.group()+" ");
		i=i+1;
		}	
	}

}
