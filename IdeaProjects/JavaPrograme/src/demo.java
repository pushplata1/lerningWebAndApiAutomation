import javafx.scene.Parent;

public class demo {


    public static void main(String[] args) {
        child d=new child();
//        d.m1();
//        d.m2();

        ParentClass p=new child();
        p.m1();

        int p1 = p.p;
        System.out.println(p1);
    }
}
