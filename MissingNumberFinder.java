package org.example;

public class MissingNumberFinder {

    public static int findMissingNumber(int[] array){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int actualSum = 0;

        // Находим минимальное и максимальное значения, а также сумму чисел
        for (int num : array) {
            if (num < min) min = num;
            if (num > max) max = num;
            actualSum += num;
        }

        // Ожидаемая сумма чисел от min до max
        int expectedSum = (max * (max + 1)) / 2 - ((min - 1) * min) / 2;

        // Пропущенное число
        return expectedSum - actualSum;


        //Временная сложность: O(n) (один проход по массиву).
        //Сложность по памяти: O(1)
    }

}