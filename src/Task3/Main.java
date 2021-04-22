package Task3;

public class Main {
    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};

        for (int i = 1; i < mass.length; i++) {
            if (i%3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}