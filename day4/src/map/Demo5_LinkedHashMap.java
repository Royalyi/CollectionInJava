package map;

import java.util.LinkedHashMap;


public class Demo5_LinkedHashMap {
	public static void main(String[] args) {
		/*��֤��ô����ôȡ���Ҽ�Ψһ*/
		LinkedHashMap<String, Integer> lhm=new LinkedHashMap<>();
		lhm.put("lulu", 19);
		lhm.put("lulu", 20);
		lhm.put("ly", 19);
		lhm.put("lu", 19);
		System.out.println(lhm);
	}
	

}
