package cn.Fan.oracle.competition;

import java.util.HashSet;
import java.util.Set;

/**  
 * 
 */
public class Main {

	public static void main(String[] args) {

		ToList<String> toList = new ToList<String>();
		java.util.List<String> list = toList.add("a").add("b", "c").toList();

	}

}
