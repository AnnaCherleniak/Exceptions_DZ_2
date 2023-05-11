package org.example;

import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Task4 {
    public static void main(String[] args) {
        try {
            String text = inputText("Введите текст: ");
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static String inputText(String s) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println(s);
        String text = scanner.nextLine();
        scanner.close();
        if (text.length() == 0 || text.equals(" ")) {
            throw new Exception("Вы ввели пустую строку!");
        }
        return text;
    }
}
