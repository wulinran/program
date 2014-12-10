import java.util.Scanner;
import java.lang.*;
public class Test{

	public static void main(String[] args){
	
		
		 System.out.println("请输入学生名字");
		 Scanner sc=new Scanner(System.in);
		 String w= sc.nextLine();
		
		 System.out.println("Hello "+w);
		
		System.out.println("***********************");
		System.out.println("|    1. 增加1个学生         | ");
		System.out.println("|    2. 显示所有学生        | ");
		System.out.println("|    3. 退出程序            | ");
		System.out.println("|    请输入选择（1-3）：    | ");
		System.out.println("************************* ");
		
		
		System.out.println("请输入选项号");

		
		Scanner sb=new Scanner(System.in);
		int ww= sb.nextInt();
		
		
		switch(ww){
		
			case 1:
			System.out.println("增加1个学生");
			break;
			case 2:
			System.out.println(" 显示所有学生");
			break;
			case 3:
			System.out.println(" 退出程序");
			break;
			default :
			System.out.println("输入有误");
		
		}
        
		
	}
}