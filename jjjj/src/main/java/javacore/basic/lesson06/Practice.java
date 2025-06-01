/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson06;

/**
 *
 * @author Admin
 */
public class Practice {

    public static final double sum(double... x) {
        double result = 0;
        for (double i : x) {
            result += i;
        }
        return result;
    }

    public static final double getMin(double... x) {
        double min = x[0];
        for (double i : x) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static final double getMax(double... x) {
        double max = x[0];
        for (double i : x) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static String toUpper(String str) {
        StringBuilder ketQua = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                ketQua.append((char) (ch - 32));
            } else {
                ketQua.append(ch);
            }
        }
        return ketQua.toString();
    }

    public static String toLower(String str) {
        StringBuilder ketQua = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                ketQua.append((char) (ch + 32));
            } else {
                ketQua.append(ch);
            }
        }
        return ketQua.toString();
    }

    public static String toUpperFirstChar(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                char firstChar = words[i].charAt(0);
                String upperFirstChar = String.valueOf(firstChar).toUpperCase();
                words[i] = upperFirstChar + words[i].substring(1).toLowerCase();
            }
        }
        return String.join(" ", words);
    }

    public static long getFibonacci(int position) {
       if (position <= 2) {
            return 1;
        }
        long a = 1, b = 1, c = 0;
        for (int i = 3; i <= position; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
