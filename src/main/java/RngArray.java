/*
Сформировать и заполнить массив случайным числами и вывести максимальное, минимальное и среднее значение.
Для генерации случайного числа использовать метод Math.random(), который возвращает значение в промежутке [0, 1].
*/

public class RngArray {
    public static void rngArray(int number) {
        double[] array = new double[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        double min = array[0];
        double max = 0;
        double avg = 0;

        for (double v : array) {
            if (max < v) max = v;
            if (min > v) min = v;
            avg += v;
        }
        avg /= array.length;

        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + avg);
    }
}