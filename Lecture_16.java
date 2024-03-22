class Demo{
    private int A=10;
    private int B=20;
    private int C=30;
    private int D=40;
    public int getA(){
            System.out.println("A value is retrived");
              return this.A;
    }
    public void setA(int x){
        System.out.println("A is setted to value:"+x);
         this.A=x;
    }
    public int getB(){
        System.out.println("B value is retived:");
         return this.B;
    }
    public void setB(int x){
        if(x>200){
            System.out.println("B is setted to value:"+x);
           this.B=x;
        }
        else{
            System.out.println("B is not setted to value:"+x);
        }
    }
}
public class Lecture_16 {
    public static void main(String[] args) {
        Demo d=new Demo();
        Demo d1=new Demo();
        System.out.println(d.getA());
        d.setA(100);
        System.out.println(d.getA());
        System.out.println(d1.getA());
        System.out.println(d.getB());
        d.setB(199);
        System.out.println(d.getB());
        d.setB(201);
        System.out.println(d.getB());
        
    }
}