/*
Напишите метод, который будет вычислять угол между часовой и минутной стрелками часов.
На вход функции подаётся время в виде двух переменных: "hours" и "minutes"
*/

public class Clock {
    private static void calcDegree(int hours, int minutes) {
        double hoursInDegree = hours * 30 + (minutes * 30) / 60;
        double minutesInDegree = minutes * 6;
        double degree = Math.abs(hoursInDegree - minutesInDegree);
        double result = degree <= 180 ? degree : 360 - degree;

        System.out.println("Время: " + hours + ":" + minutes + " градусы - " + result);
    }

    public static void main(String[] args) {
        calcDegree(5, 30);
    }

}