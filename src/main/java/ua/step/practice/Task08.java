package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 * Задание: Заполнить массив размерности n случайными строчны-
 * ми (маленькими) латинскими буквами. Подсчитать, сколько раз встреча-
 * ется каждая буква. Вывести буквы, которые встречаются
 * больше 3 раз. n – задается с клавиатуры.
 * <p>
 * Пример вывода:
 * g - 4 раза
 * l - 4 раза
 * s - 5 раз
 * v - 5 раз
 * x - 5 раз
 */
public class Task08 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest08
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        Random rnd = new Random(seed);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");

        int len = scanner.nextInt();
        int[] arr = new int[len];

        Arrays.setAll(arr, i -> (char) rnd.nextInt('z' - 'a' + 1) + 'a');

        int[] counter = new int[Arrays.stream(arr).max().getAsInt() + 1];

        for (int i = 0; i < arr.length; i++) {
            counter[arr[i]]++;
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] < 4)
                continue;
            System.out.printf(counter[i] > 1 && counter[i] < 5 ? "%c - %d раза\n" : "%c - %d раз\n", (char) i, counter[i]);
        }

        // TODO: Пишите код здесь
    }
}
