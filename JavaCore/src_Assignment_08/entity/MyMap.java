package entity;

import java.util.ArrayList;
import java.util.List;

public class MyMap<K, V> {
	
	private List<K> keys;
	private List<V> values;
	
	public void MyMap̣() {
		keys = new ArrayList<K>();
		values = new ArrayList<V>();
	}
	
	public MyMap(K key, V value) {
		keys.add(key);
		values.add(value);
	}
	
	public V getValue(K key) {
		int index = keys.indexOf(key);
		return values.get(index);
		
	}
	public List<K> getKey(V value){
		List<K> keydup = new ArrayList<K>();
		
		for(int i=0 ; i<values.size(); i++) {
			
			if( values.get(i) == value) {
				keydup.add(keys.get(i));
			}
		}
		return keydup;
	}
}
