public class lizi{
	public static void main(String[] args){
	
		Circle c=new Circle(500);
		int countNum=0;
		Kid k=c.first;
		while(c.count>1){
			countNum++;
			if(countNum==3){
				countNum=0;
				c.delete(k);
			}
			k=k.right;
		}
		System.out.print(c.first.id);
	}

}
class Kid{
	int id;
	Kid left,right;
}
class Circle{
	int count=0;
	Kid first,last;
	
	Circle(int n){
		for(int i=0;i<n;i++){
		 add();
		}
	
	}
	void add(){
		Kid k=new Kid();
		k.id=count;
		if(count<=0){
			first=k;
			last=k;
			k.left=k;
			k.right=k;
		}else{
		
			last.right=k;
			k.left=last;
			k.right=first;
			first.left=k;
		}
		count++;
	
	}
		void delete(Kid k){
			if(count<=0){
		
				return;
			}else if(count==1){
				first=last=null;
			}else{
				k.left.right=k.right;
				k.right.left=k.left;
				if(k==first){
					first=k.right;
				}else if(k==last){
				
					last=k.left;
				}
			}
			count--;	
		}	
	
	}

