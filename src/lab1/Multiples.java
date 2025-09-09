package lab1;

public class Multiples {
    public static void main(String[] args) {
        int multipleCount = 0;

        for (int i = 1; i <=1000; i++){
            if (i % 3 == 0 || i % 5 == 0) {
                multipleCount++;
            }
        }
        System.out.println("The number of multiple of 3 or 5 under 1000 is " + multipleCount);

    }
}
