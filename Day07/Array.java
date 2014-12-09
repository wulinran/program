class Array{

	public static void main(String[] args){
	
		int[] arr={15,54,6,64,661,616,4,949,66,};
		
			int max=arr[0];
		
			for(int x=1;x<arr.length;x++){
			
				if(arr[x]>max){
				
					max=arr[x];
				}
			}
			System.out.println(max);
		}



}
//获取数组中的最大值