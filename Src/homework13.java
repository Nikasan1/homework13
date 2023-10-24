import java.util.Random;
import java.util.Scanner;

public class homework13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розміри матриці :");
        int lengthArrayNumA = scanner.nextInt();
        int lengthArrayNumB = scanner.nextInt();
        int[][] array = new int[lengthArrayNumA][lengthArrayNumB];
        Random random = new Random();
        System.out.println("Матриця");
        for (int i = 0; i < lengthArrayNumA; i++) {
            for (int j = 0; j < lengthArrayNumB; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < lengthArrayNumA; i++) {
            for (int j = 0; j < lengthArrayNumB; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println("Транспонована матриця");

        for (int i = 0; i < lengthArrayNumA; i++) {
            for (int j = i + 1; j < lengthArrayNumB; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        for (int i = 0; i < lengthArrayNumA; i++) {
            for (int j = 0; j < lengthArrayNumB; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }

    }
}
