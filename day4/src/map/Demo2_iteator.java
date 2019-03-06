package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo2_iteator {
	/*
	* B:案例演示
	* Map集合的遍历之键值对对象找键和值
	* */
	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put("张三", 23);
		hm.put("李四", 24);
		hm.put("王五", 25);
		hm.put("赵六", 26);
		/*增强for循环遍历map*/
		Set<String> keyset=hm.keySet(); //返回此映射中所包含的键的 Set 视图。
		for (String string : keyset) {
			System.out.println(string+"..."+hm.get(string));
		}
		System.out.println(keyset);
		/*根据keyset方法将键存储在set类中，调用iterator即可遍历*/
		Iterator<String> it=keyset.iterator();
		while(it.hasNext()){
			String str=it.next();
			System.out.println(str+"..."+hm.get(str));
		}
	}
}
