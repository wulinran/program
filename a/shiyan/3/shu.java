import java.util.Scanner;
public class shu{
	public static void main(String[] args) { 
      int[][]arr=new int[20][5]; //声明一个数组 

	    for(int i=0;i<arr.length;i++)  { 
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=(int)(Math.random()*100+1);
			}
		}
	  //随机产生1到100之间的任意数，你可以改成你想要的随机产生的数
	  
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
		System.out.println("请输入所要查的课程");
		Scanner sc=new Scanner(System.in);
		String h=sc.nextLine();
		
		if("core C++".equals(h)){
			System.out.println("你所查的课程平均分为："+b[0]);
		}else if("coreJava".equals(h)){
			System.out.println("你所查的课程平均分为："+b[1]);
		}else if("Servlet".equals(h)){
			System.out.println("你所查的课程平均分为："+b[2]);
		}else if("JSP".equals(h)){
			System.out.println("你所查的课程平均分为："+b[3]);
		}else if("EJB".equals(h)){
			System.out.println("你所查的课程平均分为："+b[4]);
		}else {
			System.out.println("你输入的有误");
		}
	}
		
}
	  