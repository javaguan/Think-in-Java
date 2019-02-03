package chapter17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
	
public class Synchronization {
public static void main(String[] args) {
	Collection<String>c=Collections.synchronizedCollection(new ArrayList<>());
	List<String>list=Collections.synchronizedList(new ArrayList<>());
	Set<String>set=Collections.synchronizedSet(new HashSet<>());
	Set<String>set2=Collections.synchronizedSortedSet(new TreeSet<>());
	Map<String, String>map=Collections.synchronizedMap(new HashMap<>());
	Map<String, String>map2=Collections.synchronizedSortedMap(new TreeMap<>());
	
}
}
