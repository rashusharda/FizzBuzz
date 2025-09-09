package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples(10, 3, 5);
        System.out.println(count);

    }

    static int multiples(int n, int a, int b) {
        int multipleCount = 0;

        for (int i = 1; i < n; i++){
            if (i % a == 0 || i % b == 0) {
                multipleCount++;
            }
        }
        return multipleCount;
    }
}
