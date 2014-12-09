


public class Dog{

   //属性
   
   int age;   //实例变量：依赖于对象【类名。类变量】
   String  color;   
   static String type;//品种
   
   
   //静态代码块
   static{//使命：初始化类变量
   
      type="xxxxxxx";
	  System.out.println(type);
   }
   //方法

   Dog(){
   
   }
   Dog(int age,String color){
      this.type="sissisi";
      this.age=age;
       this.color=color;
   }
   //实例方法：this代表调用者的引用
   
   void bark(){
     this.type="taidi";
	 System.out.println("barking......");
   
   }
   //  类方法：不能访问实例变量    不依赖对象
   static void bark1(){//没有实例对象，所以不能调用实例变量  只能访问类变量和局部变量

   
   //abstract与static不能同时存在
     //this.age=11;
     type="jingb";
     System.out.println("leifangfa");
   }
}