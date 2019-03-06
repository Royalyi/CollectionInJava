package file;

import java.io.File;
import java.util.Scanner;

public class ExacteFile {
	/*获取指定目录下指定后缀名的文件名称
	 * 
	 * 分析：1从键盘输入文件地址
	 * 2判断输入是否为文件夹，非文件，文件
	 * 3将文件夹存储在文件数组中
	 * 4遍历数组并输出符合要求的文件名称
	 * 
	 * */
	public static void main(String[] args) {
		getFileName();
	}
	public static File getFileName(){ 
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入一个文件夹");
	String str=sc.nextLine();
	File file=new File(str);
	while(true){
	if(file.isFile()){
		System.out.println("请输入文件夹，不是文件");
		getFileName();
	}
	
	else if(!file.exists()){
		System.out.println("请输入正确的文件夹");
		getFileName();
	}
	else if(file.isDirectory())
		System.out.println("请执行下一步");
		break;
	}
	return file;
	
	}
}
