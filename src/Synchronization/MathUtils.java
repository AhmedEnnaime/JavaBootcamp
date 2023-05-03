package Synchronization;

public class MathUtils {
    // Synchronized keyword makes the method synchronized which means it will execute thread by thread not 2 simultaneously
    synchronized void getMultiples(int n){
        // You can lock a specific block of code not the whole method if you want to with the synchronized keyword
        for (int i = 1; i <= 5; i++){
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            }catch (Exception e){
                System.out.println(e);
            }
        }

    }
}
