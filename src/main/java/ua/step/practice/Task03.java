package ua.step.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Задание: Написать программу, которая проверяет, все ли значения
 * элементов массива одинаковые. Вывести: Yes – если все оди-
 * наковы и No – если имеется хоть одно различие.
 * Размер массива задается и инициализируется в начале программы.
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();

        // TODO: Пишите код здесь
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        // Через distinct() будет лучше
        System.out.println(Arrays.stream(arr).distinct().count() != 1 ? "No" : "Yes" );

    }
}
