
import java.util.Scanner;
class Function{

	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		
		System.out.println("������n");
		
		int n=sc.nextInt();
		printnn(n);
	}	
		/*
		
			����дһ��������ʵ�����nn�˷���
			
			��ȷ������ֵ���ͣ�void
			�����б�int n
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
