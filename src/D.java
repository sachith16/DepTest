public class D extends C {
    void c1(String str){
        System.out.println("c1 of D calling from "+str);
    }

    public void b1(String str) {
        System.out.println("Method b1 in D calling from "+str);
    }

    void d1(String str){
        c3(str);
    }

    void d2(String str){
        System.out.println("d2 of D calling from "+str);
    }
}
