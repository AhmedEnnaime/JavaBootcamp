package Synchronization;

public class SynchronizationDemo {
    public static void main(String[] args){
        MathUtils obj = new MathUtils();

        Thread1 t1 = new Thread1(obj);
        Thread t2 = new Thread(new Thread2(obj));
        t1.start();
        t2.start();
    }
}
