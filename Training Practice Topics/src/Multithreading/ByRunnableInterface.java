package Multithreading;

class Hii implements Runnable{
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

class Helloo implements Runnable{
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

public class ByRunnableInterface {
        public static void main(String[] args){
            Hii obj1=new Hii();
            Helloo obj2=new Helloo();

            Thread t1=new Thread(obj1);
            Thread t2=new Thread(obj2);

            t1.start();
            try{Thread.sleep(500);}catch (Exception e){}
            t2.start();
        }
}
