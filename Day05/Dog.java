


public class Dog{

   //����
   
   int age;   //ʵ�������������ڶ����������������
   String  color;   
   static String type;//Ʒ��
   
   
   //��̬�����
   static{//ʹ������ʼ�������
   
      type="xxxxxxx";
	  System.out.println(type);
   }
   //����

   Dog(){
   
   }
   Dog(int age,String color){
      this.type="sissisi";
      this.age=age;
       this.color=color;
   }
   //ʵ��������this��������ߵ�����
   
   void bark(){
     this.type="taidi";
	 System.out.println("barking......");
   
   }
   //  �෽�������ܷ���ʵ������    ����������
   static void bark1(){//û��ʵ���������Բ��ܵ���ʵ������  ֻ�ܷ���������;ֲ�����

   
   //abstract��static����ͬʱ����
     //this.age=11;
     type="jingb";
     System.out.println("leifangfa");
   }
}