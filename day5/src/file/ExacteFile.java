package file;

import java.io.File;
import java.util.Scanner;

public class ExacteFile {
	/*��ȡָ��Ŀ¼��ָ����׺�����ļ�����
	 * 
	 * ������1�Ӽ��������ļ���ַ
	 * 2�ж������Ƿ�Ϊ�ļ��У����ļ����ļ�
	 * 3���ļ��д洢���ļ�������
	 * 4�������鲢�������Ҫ����ļ�����
	 * 
	 * */
	public static void main(String[] args) {
		getFileName();
	}
	public static File getFileName(){ 
	Scanner sc=new Scanner(System.in);
	System.out.println("������һ���ļ���");
	String str=sc.nextLine();
	File file=new File(str);
	while(true){
	if(file.isFile()){
		System.out.println("�������ļ��У������ļ�");
		getFileName();
	}
	
	else if(!file.exists()){
		System.out.println("��������ȷ���ļ���");
		getFileName();
	}
	else if(file.isDirectory())
		System.out.println("��ִ����һ��");
		break;
	}
	return file;
	
	}
}
