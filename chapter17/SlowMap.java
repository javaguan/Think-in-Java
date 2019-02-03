package chapter17;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SlowMap<K,V>extends AbstractMap<K, V> {
	private List<K> keys=new ArrayList<K>();
	private List<V> values=new ArrayList<>();
	public V put(K k,V v) {
		V oldValue=get(k);
		if(!keys.contains(k)) {keys.add(k);
		values.add(v);}else
			values.set(keys.indexOf(k),v);
		return oldValue;
	}
	public V get(Object key) {
		if(!keys.contains(key))return null;
		return values.get(keys.indexOf(key));
	}
    public Set<Map.Entry<K,V>> entrySet(){//Map.Entry为Map的一个内部接口,所以不能实例化，需要定义它的实现
    	Set<Map.Entry<K, V>>set=new HashSet<Map.Entry<K,V>>();
    	Iterator<K>ki=keys.iterator();
    	Iterator<V>vi=values.iterator();
    	while(ki.hasNext())set.add(new MapEntry<K, V>(ki.next(),vi.next()));
    	return set;
    }
public static void main(String[] args) {
	SlowMap<String, String>map=new SlowMap<>();
	map.put("Ch", "China");
	map.put("ST", "String");
	map.put("M", "Map");
	map.put("Gu", "guanjian");
	map.put("Fa", "fangzai");
	System.out.println(map);
	System.out.println(map.get("Fa"));
	System.out.println(map.entrySet());
}
}
