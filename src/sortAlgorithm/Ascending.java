package sortAlgorithm;

import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        mergeSort(array, 0, array.length - 1);
        for (int i = 0; i < N; i++) {
            sb.append(array[i]).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = array[i++];
        }

        while (j <= right) {
            temp[k++] = array[j++];
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            array[i] = temp[k];
        }

//  최악의 경우 시간 복잡도는 O(N2) 2는 제곱
//        int N = sc.nextInt();
//        int [] array = new int[N];
//        for (int i = 0; i < N; i++) {
//            array[i] = sc.nextInt();
//        }
//        ascendingSort(array);
//        for (int i = 0; i < N; i++) {
//            sb.append(array[i]).append("\n");
//        }
//        System.out.println(sb.toString());
//    }
//    // 5 2 3 4 1 -> 2 5 3 4 1 -> 2 3 5 4 1
//    private static void ascendingSort(int[] array) {
//        for (int i = 1; i < array.length; i++) {
//            int key = array[i];
//            int j = i - 1;
//            while (j >= 0 && array[j] > key) {
//                array[j+1]=array[j];
//                j = j - 1;
//            }
//            array[j + 1] = key;
//
//        }
    }
}