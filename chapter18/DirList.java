package chapter18;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList{
	public static void main(String[] args) {
		File path=new File(".");//��ʾ�õ�ǰ·��������һ��fileʵ��
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
		pattern=Pattern.compile(s);//s��Pattren ����
	}
	public boolean accept(File dir,String name) {
		return pattern.matcher(name).matches();//matches()�����ж�ƥ���Ƿ���ȷ������boolean
	}
	
}