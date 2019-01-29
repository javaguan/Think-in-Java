package chapter13;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SplitDome {

	public static void main(String[] args) {
		String input="This!!unusual use!!of exclamation!!points";
		System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
		System.out.println(Arrays.toString(Pattern.compile("!!").split(input,3)));
		//这里的3限制了分割出来的子串最大数量为3
	}
}
