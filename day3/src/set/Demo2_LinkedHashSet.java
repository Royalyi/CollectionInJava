package set;

import java.util.LinkedHashSet;//��ô����ôȡ�ұ�֤��Ԫ�ص�Ψһ��

public class Demo2_LinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		lhs.add(1);
		lhs.add(2);
		lhs.add(3);
		lhs.add(5);
		lhs.add(4);
		
		System.out.println(lhs);
 } 
}
