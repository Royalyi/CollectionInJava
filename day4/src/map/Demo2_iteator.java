package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo2_iteator {
	/*
	* B:������ʾ
	* Map���ϵı���֮��ֵ�Զ����Ҽ���ֵ
	* */
	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put("����", 23);
		hm.put("����", 24);
		hm.put("����", 25);
		hm.put("����", 26);
		/*��ǿforѭ������map*/
		Set<String> keyset=hm.keySet(); //���ش�ӳ�����������ļ��� Set ��ͼ��
		for (String string : keyset) {
			System.out.println(string+"..."+hm.get(string));
		}
		System.out.println(keyset);
		/*����keyset���������洢��set���У�����iterator���ɱ���*/
		Iterator<String> it=keyset.iterator();
		while(it.hasNext()){
			String str=it.next();
			System.out.println(str+"..."+hm.get(str));
		}
	}
}
