package compositionLearn;

public class C implements B{
    private A a;
    private int c;

    public C(){}
    public C(A as, int cs){
        this.a = as;
        this.c = cs;
    }
    public void print(){

        System.out.println("this is print method declared in B interface and called in C class.");
        System.out.println(a+"  "+c);
        System.out.println("comming from Class A ");
        a.display();
    }

    public static void main(String args[]){
        A objA = new A(2);
        C objc = new C(objA, 3);
        objc.print();

    }
}
