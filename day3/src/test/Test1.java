package test;

import java.util.HashSet;
import java.util.Random;

public class Test1 {
	/* A:������ʾ
	* ���󣺱�дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ����������յ���������������̨��
	* 
	* ������
	* Random��������
	* Hashsetʵ�ֲ��ظ�����LinkedHashSetЧ�ʸ�
	*/
public static void main(String[] args) {
	Random r=new Random();
	HashSet<Integer> hs=new HashSet<>();
	while(hs.size()<=10){
		hs.add(r.nextInt(20)+1);
	}
	
	System.out.println(hs);
}
}
