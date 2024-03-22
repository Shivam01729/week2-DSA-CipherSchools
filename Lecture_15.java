public class Lecture_15 {
    int x=10;
    private int y=15;
    public int z=20;
    protected int w=25;
    public static void main(String[] args) {
        Lecture_15 ob=new Lecture_15();
        //Within the class default ,public ,private  and protected are accessible
        System.err.println(ob.x); 
        System.err.println(ob.y);
        System.err.println(ob.z);
        System.err.println(ob.w);
    }
}

class B {
    public static void main(String[] args) {
        Lecture_15 ob1=new Lecture_15();
        //except private all are accessible within the package
        // System.out.println(ob1.x);
        // System.out.println(ob1.y);
        // System.out.println(ob1.z);
        // System.out.println(ob1.w);
    }
}


class C extends Lecture_15 {
    public static void main(String[] args) {
        Lecture_15 ob2=new Lecture_15();
        //default and private are not accessible outside packge
        //System.out.println(ob2.x);
       // System.out.println(ob2.y);
        // System.out.println(ob2.z);
        // System.out.println(ob2.w);
    }
}



class D{
    
}