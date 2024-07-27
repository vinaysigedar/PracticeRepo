package practicepackage;

///// This is an example of constructor overloading
public class ConstructorExample {
    int a;
    int b;
    String s;
    String x;
    String y;
    String s1;
    public ConstructorExample(int a, int b, String s){
        this.a=a;
        this.b=b;
        this.s=s;
    }
    public ConstructorExample(String x, String y, String s1){
        this.x=x;
        this.y=y;
        this.s1=s1;
    }
    public static void main(String[] args) {
        int a=20;
        int b=30;
        String s="Vinay";
        System.out.println(a);
        System.out.println(b);
        System.out.println(s);

        ConstructorExample ce=new ConstructorExample(55,60,"Akanksha");
        ConstructorExample ce1=new ConstructorExample("Vinay","Nikhil","Andy");
        System.out.println(ce.a);
        System.out.println(ce.b);
        System.out.println(ce.s);
        System.out.println(ce1.x);
        System.out.println(ce1.y);
        System.out.println(ce1.s1);
    }
}
