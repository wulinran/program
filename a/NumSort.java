public class NumSort{
	public static void main(String[] args){
		int[] a=new int[args.length];
		System.out.println("������һЩ����");
		for(int i=0;i<args.length;i++){
		
			a[i]=Integer.parseInt(args[i]);
		}
		System.out.print("����ǰΪ��");
		print(a);
		System.out.println("��������......");
		selectionSort(a);
		System.out.print("�������Ϊ��");
		print(a);
		
		
	}

	
	private static void selectionSort(int[] a){
		for(int i=0;i<a.length;i++){
			int k=i;
			for(int j=k+1;j<a.length;j++){
			
				if(a[j]<a[k]){
					k=j;
				}
			}
			if(k!=i){
				int temp=a[i];
				a[i]=a[k];
				a[k]=temp;
			}
		}
	
	}
	private static void print(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
	}
}