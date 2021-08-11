package p2;
import p1.*;
class Access extends AccessModifireEx {

    public static void main(String args[]) {
        Access a = new Access();
        a.msg();
        int b=a.ab;
        System.out.println(b);
    }
}
