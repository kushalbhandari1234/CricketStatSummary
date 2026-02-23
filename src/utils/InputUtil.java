package utils;

import java.util.Scanner;

public class InputUtil {

    private static final Scanner sc = new Scanner(System.in);

    public static String readString(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static int readInt(String message) {
        System.out.print(message);
        return sc.nextInt();
    }
}