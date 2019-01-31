package chapter16;

import java.util.Comparator;

public class Comtypecomparator implements Comparator<CompType>{
	public int compare(CompType a1,CompType a2) {
		return(a1.j<a2.j?-1:(a1.j==a2.j?0:1));
	}
}
