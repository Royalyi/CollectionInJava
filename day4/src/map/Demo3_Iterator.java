package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo3_Iterator {
		/* 	A:��ֵ�Զ����Ҽ���ֵ˼·��
		* ��ȡ���м�ֵ�Զ���ļ���
		* ������ֵ�Զ���ļ��ϣ���ȡ��ÿһ����ֵ�Զ���
		* ���ݼ�ֵ�Զ����Ҽ���ֵ*/
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put("����", 23);
		hm.put("����", 24);
		hm.put("����", 25);
		hm.put("����", 26);
//		map.entry˵��entry��map���ڲ��ӿڣ�������ֵ��װ��entry���󲢱��浽set������
	/*	��ǿforѭ�h*/
		Set<Map.Entry<String, Integer>> me = foreach(hm);
		
		/*������*/
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
