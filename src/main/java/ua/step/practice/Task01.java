package ua.step.practice;

/**
 * Заполнить массив на 15 элементов числами Фибоначчи.
 * Вывести на консоль только четные элементы массива.
 * <p>
 * Пример вывода:
 * 1 2 5 13 34 89 233 610
 */
public class Task01 {
    public static void main(String[] args) {
        // TODO: Пишите код здесь
        // Создать массив нужно было не "ручками"
        int mas[] = new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        for (int i = 0; i < mas.length; i+=2) {
            System.out.print(mas[i] + " ");
        }

    }
}