import java.util.Scanner;
public class huiwenshu{
	static int p=1;
	
	public static void main(String[] args){
		System.out.println("请输入一个1—9999之间的数");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		weishu(a);
		System.out.println("这个数是"+p+"位数");
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
			System.out.println("这个数是回文数");
		}else{
			System.out.println("这个数不是回文数");
		}
	}

}