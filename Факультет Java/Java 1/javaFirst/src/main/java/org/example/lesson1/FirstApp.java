package org.example.lesson1;

public class FirstApp {

    public static void main(String[] args) {

    }

    //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float
    public static float calculateBySomeFormula(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    //Написать метод, принимающий на вход два целых числа и проверяющий,
    //что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean betweenTenToTwenty(int first, int second) {
        int sum = first + second;
        return sum >= 10 && sum <= 20;
    }

    //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    //положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void printTypeOfNumber(int number) {
        if (positive(number)) {
            System.out.println("It's positive number");
        } else {
            System.out.println("It's negative number");
        }
    }

    //Написать метод, которому в качестве параметра передается целое число.
    //Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean positive(int number) {
        return number >= 0;
    }

    //Написать метод, которому в качестве параметра передается строка,
    //обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!»
    public static void printGreeting(String name) {
        System.out.println("Привет, " + name + "!");
    }

    //Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    //Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
    public static void leapYear(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            System.out.println(year + " г. не високосный");
        } else {
            System.out.println(year + " г. високосный");
        }
    }
}
