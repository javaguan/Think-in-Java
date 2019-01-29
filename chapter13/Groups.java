package chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
	static public final String POEM="Twss brilli, and the slithy tovves\n"+
                                    "did  jiujiu, one two three four\n ";
	public static void main(String[] args) {
		Matcher matcher=Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$").matcher(POEM);
		while(matcher.find()) {
			for(int j=0;j<=matcher.groupCount();j++) {
				System.out.println("["+matcher.group(j)+"]");
			}
		}
	}

}
