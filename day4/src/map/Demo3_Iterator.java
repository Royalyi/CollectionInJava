package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo3_Iterator {
		/* 	A:键值对对象找键和值思路：
		* 获取所有键值对对象的集合
		* 遍历键值对对象的集合，获取到每一个键值对对象
		* 根据键值对对象找键和值*/
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put("张三", 23);
		hm.put("李四", 24);
		hm.put("王五", 25);
		hm.put("赵六", 26);
//		map.entry说明entry是map的内部接口，将键和值封装成entry对象并保存到set集合中
	/*	加强for循環*/
		Set<Map.Entry<String, Integer>> me = foreach(hm);
		
		/*迭代器*/
		Iterator<Map.Entry<String, Integer> > it=me.iterator();
		while(it.hasNext()){
			Entry<String, Integer> str=it.next();
			System.out.println(str.getKey()+"..."+str.getValue());
		}
	}

		private static Set<Map.Entry<String, Integer>> foreach(HashMap<String, Integer> hm) {
			Set<Map.Entry<String, Integer>> me=hm.entrySet();
			for (Entry<String, Integer> entry : me) {
				System.out.println(entry);
			}
			return me;
		}
}
