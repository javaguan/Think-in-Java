package chapter17;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class SpringDetector {
public static <T extends Groundhog> void  detectSpring(Class<T>type)throws Exception{
	Constructor<T>ghog=type.getConstructor(int.class);
	Map<Groundhog,Prediction>map=new HashMap<>();
	for(int i=0;i<10;i++) {
		map.put(ghog.newInstance(i), new Prediction());
	}
	System.out.println("Map="+map);
	Groundhog gh=ghog.newInstance(3);
	System.out.println("Look up predition for "+gh);
	if(map.containsKey(gh))System.out.println(map.get(gh));
	else System.out.println("key not found："+gh);
	
}
public static void main(String[] args) throws Exception{
	detectSpring(Groundhog.class);//Groundhog继承了Object根据储存地址计算散列码的方法hashCode()
	//所以两个number都等于三的GroundHog的实例是不同的两个实例
}
}
