import java.util.Scanner;
import java.lang.*;
public class Test{

	public static void main(String[] args){
	
		
		 System.out.println("������ѧ������");
		 Scanner sc=new Scanner(System.in);
		 String w= sc.nextLine();
		
		 System.out.println("Hello "+w);
		
		System.out.println("***********************");
		System.out.println("|    1. ����1��ѧ��         | ");
		System.out.println("|    2. ��ʾ����ѧ��        | ");
		System.out.println("|    3. �˳�����            | ");
		System.out.println("|    ������ѡ��1-3����    | ");
		System.out.println("************************* ");
		
		
		System.out.println("������ѡ���");

		
		Scanner sb=new Scanner(System.in);
		int ww= sb.nextInt();
		
		
		switch(ww){
		
			case 1:
			System.out.println("����1��ѧ��");
			break;
			case 2:
			System.out.println(" ��ʾ����ѧ��");
			break;
			case 3:
			System.out.println(" �˳�����");
			break;
			default :
			System.out.println("��������");
		
		}
        
		
	}
}