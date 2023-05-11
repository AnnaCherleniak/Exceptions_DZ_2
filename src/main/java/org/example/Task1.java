package org.example;

import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
// необходимо повторно запросить у пользователя ввод данных.
public class Task1 {

    public static void main(String[] args) {
        boolean temp = true;
        Float num = null;
        while (temp) {
            try {
                num = inputNumber("Введите дробное число");
                temp = false;
            } catch (Exception e) {
                System.out.println("Вы ввели неверные данные!");
            }
        }
        System.out.printf("Вы ввели число - %f", num);
    }

    private static Float inputNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        Float result = scanner.nextFloat();
        scanner.close();
        return result;
    }
}