package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection c=new ArrayList();	//��������ָ���������
		 c.add("aff");
		 c.add("af");
		 c.add("a");
		 c.add("affq");
		 c.add("affqq");
		Iterator it=c.iterator();  //��ȡ������������
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
