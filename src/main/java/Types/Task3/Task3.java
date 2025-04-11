package Types.Task3;

/**Задание 3

 Написать код, который выведет значения переменных на экран:

 byte b = 0x55;
 short s = 0x55ff;
 int i = 1000000;
 long l = 0xffffffffL;
 char c = 'a' ;
 float f = .25f;
 double d = .00001234;
 boolean bool = true;

 Использовать 1 метод и 1 System.out.println().
 */

public class Task3 {
    public static void main(String[] args) {
        byte b = 0x55;
        short s = 0x55ff;
        int i = 1000000;
        long l = 0xffffffffL;
        char c = 'a';
        float f = .25f;
        double d = .00001234;
        boolean bool = true;
        printAll(b, s, i, l, c, f, d, bool);
    }

    public static void printAll(byte b, short s, int i, long l, char c, float f, double d, boolean bool) {
        System.out.println("b = " + b + "\n" + "s = " + s + "\n" + "i = " + i + "\n" + "l = " + l + "\n" +
                            "c = " + c + "\n" + "f = " + f + "\n" + "d = " + d + "\n" + "bool = " + bool);
    }
}


