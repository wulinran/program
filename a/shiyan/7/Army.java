public class Army{
	
	
	int i ;
	int n = 0 ;
	Weapon [] w ;
	public Army(int i){
		this.i = i;
		w= new Weapon[i];
	}
	
	public void addWeapon(Weapon wa){
		
		if(n<i){
			w[n] = wa;
			n++;
			
		}
			return;
		
	}
	
	public void attackAll(){
		
		System.out.println("������������");
		for (Weapon ww : w ){
			if (ww!=null){
				ww.attack();
			}
		}
	
	}
	public void moveAll(){
		
	System.out.println("���������ƶ�");
	for (Weapon ww : w ){
			if (ww!=null){
				ww.move();
			}
		}
	}
}