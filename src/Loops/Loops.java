package Loops;

public class Loops {
    public  void loops() {
        String[] names = {"Ahmed", "Aymen", "Karim", "Ayoub"};
        // for loop
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        // enhanced for loop
        for(String name : names){
            System.out.println(name);
        }

        // while loop
        int i = 0;
        while (i < names.length) {
            System.out.println(names[i]);
            i++;
        }

        // do while loop

        do {
            System.out.println(names[i]);
            i++;
        } while (i < names.length);

    }
}
