import java.util.Scanner;
public class shu{
	public static void main(String[] args) { 
      int[][]arr=new int[20][5]; //����һ������ 

	    for(int i=0;i<arr.length;i++)  { 
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=(int)(Math.random()*100+1);
			}
		}
	  //�������1��100֮���������������Ըĳ�����Ҫ�������������
	  
	  for(int i=0;i<arr.length;i++)  { 
			
	  
		for(int j=0;j<arr[i].length;j++){
				System.out.print("\t"+arr[i][j]); 
			
			}
			System.out.println("\t"); 
		}
		int temp=0;int a[]=new int[20];
		for(int i=0;i<arr.length;i++)  { 
			
	  
			for(int j=0;j<arr[i].length;j++){
				temp=temp+arr[i][j];
			}
			a[i]=temp;
		}

		
		int mp=0;int b[]=new int[5];
		for(int x=0;x<5;x++){
			for(int y=0;y<20;y++)  { 
				mp=mp+arr[y][1];
			}
				b[x]=mp/20;
		}
		System.out.println("��������Ҫ��Ŀγ�");
		Scanner sc=new Scanner(System.in);
		String h=sc.nextLine();
		
		if("core C++".equals(h)){
			System.out.println("������Ŀγ�ƽ����Ϊ��"+b[0]);
		}else if("coreJava".equals(h)){
			System.out.println("������Ŀγ�ƽ����Ϊ��"+b[1]);
		}else if("Servlet".equals(h)){
			System.out.println("������Ŀγ�ƽ����Ϊ��"+b[2]);
		}else if("JSP".equals(h)){
			System.out.println("������Ŀγ�ƽ����Ϊ��"+b[3]);
		}else if("EJB".equals(h)){
			System.out.println("������Ŀγ�ƽ����Ϊ��"+b[4]);
		}else {
			System.out.println("�����������");
		}
	}
		
}
	  