package cn.Fan.oracle.competition;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName_Tolist
 * @author_Stone6762
 * @CreationTime_2015年4月18日 上午10:41:24
 * @Description_
 */
public class ToList<T> {

	private static Object[] objs;
	private static int current;
	static {
		objs = new Object[10];
	}

	public ToList add(T... arrs) {
		if ((arrs.length + current) > objs.length) {
			makeSureCapi();
		}
		for (int i = 0; i < arrs.length; i++) {
			objs[current] = arrs[i];
			current++;
		}
		return this;
	}

	public static <T> ToList create(T... arrs) {

		ToList<T> tolist = new ToList<T>();
		if (arrs.length > objs.length) {
			makeSureCapi();
		}
		for (int i = 0; i < arrs.length; i++) {
			objs[current] = arrs[i];
			current++;
		}
		return tolist;
	}

	public List<T> toList() {
		return (List<T>) Arrays.asList(objs);
	}

	private static void makeSureCapi() {
		Object newObs[] = new Object[objs.length * 2];
		for (int i = 0; i < objs.length; i++) {
			newObs[i] = objs[i];
		}
		objs = newObs;
	}

}
