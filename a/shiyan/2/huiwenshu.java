import java.util.Scanner;
public class huiwenshu{
	static int p=1;
	
	public static void main(String[] args){
		System.out.println("������һ��1��9999֮�����");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		weishu(a);
		System.out.println("�������"+p+"λ��");
		huiwen(a);
	}
	public static int weishu(int x){
		
		
		int q=x/10;
		while(q>0){
			p++;
			q=q/10;
		}
		return p;
	}
	public static void huiwen(int x){
		int h=x;
		int b=0;
		for(int i=0;i<=p;i++){
			b=b*10+x%10;
			x=x/10;
		}
		if(h==b){
			System.out.println("������ǻ�����");
		}else{
			System.out.println("��������ǻ�����");
		}
	}

}