package cn.Fan.Sort;

import java.util.Comparator;

/**
 * @ClassName_MaxFirstOfInteger
 * @author_Stone6762
 * @CreationTime_2015��2��26�� ����8:58:24
 * @Description_
 */
public class FirstMax implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
		return i1-i2;
	}

}
