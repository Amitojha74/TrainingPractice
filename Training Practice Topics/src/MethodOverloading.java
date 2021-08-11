class Main {

    // Same method name with different datatypes
    int add(int a, int b) {
        return a + b;
    }

    long add(long a, long b) {
        return a + b;
    }

    //same method name with no of arguments different
    int minus(int a,int b) {return a-b;}
    int minus(int a,int b,int c) {return a-b-c;}

}
class MethodOverloading{

    public static void main(String[] args){
        Main m=new Main();
        System.out.println(m.add(1,4));
        System.out.println(m.add(5,4));
        System.out.println(m.minus(1,4));
        System.out.println(m.minus(5,4, 5));
    }
}
