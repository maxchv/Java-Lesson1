package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * Задание: Заполнить массив размерности n случайными цифрами
 * от 3 до 13. Подсчитать, сколько раз встречается каждая циф-
 * ра. Вывести результат на экран. n – задается с клавиатуры
 * <p>
 * Пример вывода:
 * 3 - 2 раза
 * 5 - 3 раза
 * 8 - 1 раза
 * 9 - 3 раза
 * 11 - 1 раза
 */
public class Task07 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest07
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
        //long seed = 0;

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");

        int len = scanner.nextInt();
        int[] arr = new int[len];
        Arrays.setAll(arr, i -> rnd.nextInt(13 - 3 + 1) + 3);

        int[] counter = new int[Arrays.stream(arr).max().getAsInt() + 1];

        for (int i = 0; i < arr.length; i++) {
            counter[arr[i]]++;
        }

        for (int i = 0; i < counter.length; i++) {
            if(counter[i] == 0)
                continue;
            System.out.printf("%d - %d раза\n", i, counter[i]);
        }

    }
}
