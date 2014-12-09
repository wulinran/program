
import java.util.Scanner;
class Function{

	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		
		System.out.println("请输入n");
		
		int n=sc.nextInt();
		printnn(n);
	}	
		/*
		
			需求：写一个函数，实现输出nn乘法表
			
			明确：返回值类型：void
			参数列表：int n
		*/
		public static void printnn(int n){
			for(int i=1;i<=n;i++){
        		for(int j=1;j<=i;j++){
					int a=i*j;
					System.out.print(i+"*"+j+"="+a+"\t");
				}
	                System.out.println(" ");
			}
		
		}
	
}
