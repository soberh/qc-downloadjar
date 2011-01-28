package test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	private final List values = new ArrayList();

	public void setValue(int key, Object value) {
		values.set(key, value);
	}

	public Object getValue(int key) {
		return values.get(key);
	}

	public void t1() {
	}

}
