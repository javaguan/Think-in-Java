package chapter18;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList{
	public static void main(String[] args) {
		File path=new File(".");//表示用当前路径来创建一个file实例
		String[]list;
		if(args.length==0) {
			list=path.list();
		}
		else
			list=path.list(new DirFilter(args[0]));
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		for(String li:list) {
			System.out.println(li);
		}
	}
}
class DirFilter implements FilenameFilter{
	private Pattern pattern;
	public DirFilter(String s) {
		pattern=Pattern.compile(s);//s的Pattren 对象
	}
	public boolean accept(File dir,String name) {
		return pattern.matcher(name).matches();//matches()方法判断匹配是否正确，返回boolean
	}
	
}