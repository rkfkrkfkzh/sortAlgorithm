package sortAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class AvgMidAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        Arrays.sort(numbers);
        int avg = sum / 5;
        int mid = numbers[2];

        System.out.println(avg);
        System.out.println(mid);
    }
}
