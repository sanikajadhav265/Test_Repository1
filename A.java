class A{

   A(){
    System.out.println("A Constructor");
 }

   A(int i){
     System.out.println("Parameterised Consrtructor");
}

  static{
    System.out.println("Static Block");
  }
  {
    System.out.println("Non-static Block");
  }
  public void m1(){
    System.out.println("M1 Method");
  }
  public void m2(int i,String s){
    System.out.println("Double Parameter Method");
  }
  public static void main(String[] args){
    A a=new A();
    A a1=new A(10);
    a.m1();
    a.m2(20,"Sanika");
  }
}