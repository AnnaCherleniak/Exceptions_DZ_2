package org.example;

import java.lang.reflect.Array;

//2. Если необходимо, исправьте данный код
// (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
public class Task2 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        int d = 0;
        try {
            double catchedRes1 =  ((double)intArray[8]/ d);
            System.out.println("CatchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } catch (NullPointerException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}



