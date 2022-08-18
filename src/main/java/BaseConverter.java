/*
Напишите класс BaseConverter для конвертации из градусов по Цельсию в
Кельвины(273,15), Фаренгейты((tempCelsius * 9 / 5) + 32), и так далее. У класса должен быть метод convert, который
и делает конвертацию.
*/

public class BaseConverter {
    private static double convertKelvin(double celsius) {
        return celsius + 273.15;
    }

    private static double convertFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        double celsius = 28;
        System.out.println("Перевод " + celsius + " градусов по Цельсию в Кельвины - "
                + convertKelvin(celsius));
        System.out.println("Перевод " + celsius + " градусов по Цельсию в Фаренгейты - "
                + convertFahrenheit(celsius));
    }


}