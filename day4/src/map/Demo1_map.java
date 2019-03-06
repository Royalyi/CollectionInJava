package map;

import java.util.HashMap;

public class Demo1_map {
	/*A:Map集合的功能概述
	* a:添加功能
		* V put(K key,V value):添加元素。
			* 如果键是第一次存储，就直接存储元素，返回null
			* 如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
	* b:删除功能
		* void clear():移除所有的键值对元素
		* V remove(Object key)：根据键删除键值对元素，并把值返回
	* c:判断功能
		* boolean containsKey(Object key)：判断集合是否包含指定的键
		* boolean containsValue(Object value):判断集合是否包含指定的值
		* boolean isEmpty()：判断集合是否为空
	* d:获取功能
		* Set<Map.Entry<K,V>> entrySet():
		* V get(Object key):根据键获取值
		* Set<K> keySet():获取集合中所有键的集合
		* Collection<V> values():获取集合中所有值的集合
	* e:长度功能
		* int size()：返回集合中的键值对的个数
		*/
	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<>();
		Integer in=hm.put("zs",23);
		Integer in1=hm.put("zs1",23);
		Integer in2=hm.put("zs2",23);
		Integer in3=hm.put("zs",26);
		System.out.println(in3);
		
		//clear(hm);
		
		Integer i=hm.remove("zs1");
		System.out.println(hm);
		
		//containskey(hm);
	}

	private static void containskey(HashMap<String, Integer> hm) {
		boolean b=hm.containsKey("zs");
		System.out.println(b);
	}

	private static void clear(HashMap<String, Integer> hm) {
		hm.clear();
		System.out.println(hm);
	}
}
