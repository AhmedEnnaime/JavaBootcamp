package Arrays;

public class Arrays {
    public  void arrays() {
        int [] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        // printing the array
        System.out.println(java.util.Arrays.toString(numbers));
        System.out.println(numbers.length);
        // Changing the default value of an array
        java.util.Arrays.fill(numbers, 2);
        // Shorthand
        int [] numbers2 = {0,1,2,3,4};
    }

}
