package map;

import java.util.HashMap;

public class Demo1_map {
	/*A:Map���ϵĹ��ܸ���
	* a:��ӹ���
		* V put(K key,V value):���Ԫ�ء�
			* ������ǵ�һ�δ洢����ֱ�Ӵ洢Ԫ�أ�����null
			* ��������ǵ�һ�δ��ڣ�����ֵ����ǰ��ֵ�滻����������ǰ��ֵ
	* b:ɾ������
		* void clear():�Ƴ����еļ�ֵ��Ԫ��
		* V remove(Object key)�����ݼ�ɾ����ֵ��Ԫ�أ�����ֵ����
	* c:�жϹ���
		* boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
		* boolean containsValue(Object value):�жϼ����Ƿ����ָ����ֵ
		* boolean isEmpty()���жϼ����Ƿ�Ϊ��
	* d:��ȡ����
		* Set<Map.Entry<K,V>> entrySet():
		* V get(Object key):���ݼ���ȡֵ
		* Set<K> keySet():��ȡ���������м��ļ���
		* Collection<V> values():��ȡ����������ֵ�ļ���
	* e:���ȹ���
		* int size()�����ؼ����еļ�ֵ�Եĸ���
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
