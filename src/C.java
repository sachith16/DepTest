public class C implements B{
    @Override
    public void b1(String str) {
        System.out.println("Method b1 in C calling from "+str);
    }

    void c1(String str){
        System.out.println("c1 of C calling from "+str);
    }

    public static void c2(String str){
        System.out.println("static c2 of C calling from "+str);
    }

    void c3(String str){
        System.out.println("c3 of C calling from "+str);
    }
}
