import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		System.out.print("�������ܵ�������");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		Army wq=new Army(x);
		
		
		System.out.print("������Tank��");
		Scanner sv=new Scanner(System.in);
		int y=sv.nextInt();
		
		System.out.print("������WarShip��");
		Scanner sz=new Scanner(System.in);
		int z=sz.nextInt();
		
		System.out.print("������Flighterp��");
		Scanner sq=new Scanner(System.in);
		int e=sq.nextInt();
		 
		 if(e<=x-y-z){
		 for(int i=0;i<y;i++){
			wq.addWeapon(new Tank());
		 }
		 
		 for(int i=0;i<z;i++){
			wq.addWeapon(new WarShip());
		 }
		 
		 
		 for(int i=0;i<e;i++){
			wq.addWeapon(new Flighter());
		 }
		 
		 
		 wq.attackAll();
		 wq.moveAll();
		 }else{
		 
			System.out.print("��������Tank + Flighterp + WarShip������������������������");
		 }
	
	}

}