public class ClassInit{
//类变量
  static String str=getStaticvar();
  //类方法
  private static String getStaticvar(){
     
     System.out.println("static方法=类方法");	 
      return "static变量";
  }
//实例变量
  int var=getIntVar();

//实例方法
private int getIntVar(){

  System.out.println("实例方法");
  return 123;
}
//静态代码块
static{

   System.out.println("static代码块中");

}
//构造方法
   public  ClassInit(){
   
     System.out.println("构造方法");
   
   }
   public static void main(String[] args){
      
       System.out.println("进入main");
	 
	   ClassInit ci=new ClassInit();
	   
	   System.out.println("退出main");
   }

}