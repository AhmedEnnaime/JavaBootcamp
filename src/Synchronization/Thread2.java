package Synchronization;

public class Thread2 implements Runnable{
    MathUtils mu;

    public Thread2(MathUtils mu){
        this.mu = mu;
    }

    @Override
    public void run(){
        try {
            mu.getMultiples(3);
        }catch (Exception e){
            System.out.println("Exception is caught " + e);
        }
    }

}
