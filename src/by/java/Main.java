package by.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размерность массива 'n':");
        int n = sc.nextInt();
        while (n < 1) {
            System.out.println("Введена неверная размерность, попробуйте еще раз:");
            n = sc.nextInt();
        }

        System.out.println("Заполните элементы массива:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];
        int num_min = 0, num_max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                num_min = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                num_max = i;
            }

        }


        arr[num_min] = max;
        arr[num_max] = min;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
