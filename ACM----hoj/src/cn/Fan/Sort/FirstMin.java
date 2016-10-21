package cn.Fan.Sort;

import java.util.Comparator;

/**
 * @ClassName_MinFirst
 * @author_Stone6762
 * @CreationTime_2015年2月26日 下午8:56:04
 * @Description_
 */
public class FirstMin implements Comparator<Integer> {
	@Override
	public int compare(Integer i1, Integer i2) {
		return i2 - i1;
	}
}
