package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Задание: Заполнить массив на 30 элементов случайными числами
 * от -70 до +50.
 * Найти минимальный элемент и максимальный элементы и вывести их на консоль через пробел
 */
public class Task02 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - необходимо для тестирования @see ua.step.homework.TaskTest02
        long seed = 0;// args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        int[] mas = new int[30]; // C стиль объявления массива допустим, но не желателен
        Arrays.setAll(mas, i -> rnd.nextInt(51+70) - 70);

        System.out.printf("%d %d", Arrays.stream(mas).min().getAsInt(), Arrays.stream(mas).max().getAsInt());
    }
}
