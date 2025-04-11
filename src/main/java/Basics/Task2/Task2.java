package Basics.Task2;

/**Задание 2

 Вывести Hello Java и Hello Belarus. Использовать метод из задания 1, импортировать двумя способами.
 */

import static Basics.Task1.Task1.simplePrint;

public class Task2 {
    public static void main(String[] args) {
        String str1 = "Hello Java";
        String str2 = "Hello Belarus";
        simplePrint(str1);
        Basics.Task1.Task1.simplePrint(str2);
    }
}