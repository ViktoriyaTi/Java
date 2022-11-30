
/*Добавить к калькулятору логирование */

import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;

public class TaskThree {
    public static void firstView() {
        System.out.println("Введите первое число для выполнения операции");
    }

    public static void secondView() {
        System.out.println("Введите второе число для выполнения операции");
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double difference(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(TaskThree.class.getName());
        FileHandler fh = new FileHandler("logCalculator.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        System.out
                .println("Это простой калькулятор:\nвведите цифру 1 - для выполнения операции сложения двух чисел,\n" +
                        "2 - вычитание,\n3 - умножение,\n4 - деление");
        Scanner input = new Scanner(System.in);
        int selectedValue = input.nextInt();
        firstView();
        double number1 = input.nextDouble();
        logger.info("Введено первое число");
        secondView();
        double number2 = input.nextDouble();
        logger.info("Введено второе число");

        if (selectedValue == 1) {
            System.out.println(sum(number1, number2));
            logger.info("Произведен подсчет суммы");
        } else if (selectedValue == 2) {
            System.out.println(difference(number1, number2));
            logger.info("Произведен подсчет разности");
        } else if (selectedValue == 3) {
            System.out.println(multiplication(number1, number2));
            logger.info("Произведен подсчет умножения двух чисел");
        } else
            logger.info("Произведен подсчет деления");
        System.out.println(division(number1, number2));

        input.close();
    }

}
