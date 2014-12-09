class Arrayc{

	public static void main(String[] args){
	
		int[] arr={15,5,5,54,6546,656,65987,67,21,238,897,89};

		printArray(arr);
		System.out.println("-------------------------------");
		change(arr);
		printArray(arr);
	}
	public static void change(int[] arr){
	
		for(int start=0,end=arr.length-1;start<=end;start++,end--){
		
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		}
	}
	public static void printArray(int[] arr){
	
		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr[i]);
		}
	}
}
//将数组中的数据逆序