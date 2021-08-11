package Multithreading;

// Example By Extending the thread class

class Hi extends Thread{
    public void run(){
        for(int i=0;i<4;i++) {
            System.out.println("Hii Amit");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class Hello extends Thread{
    public void run(){
        for(int i=0;i<4;i++) {
            System.out.println("Hello Amit");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
public class ExampleThread {
    public static void main(String[] args){
        Hi obj1=new Hi();
        Hello obj2=new Hello();

        obj1.start();
        try{Thread.sleep(500);}catch (Exception e){}
        obj2.start();
    }
}
