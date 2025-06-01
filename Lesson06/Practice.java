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

    public static final double getSum(double... x) {
        double s = 0;
        for (double a : x) {
            s = s + a;
        }
        return s;
    }

    public static final double getMin(double... x) {
        if (x.length == 0) {
            return 0;
        }
        double min = x[0];
        for (double a : x) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }

    public static final double getMax(double... x) {
        if (x.length == 0) {
            return 0;
        }
        double max = x[0];
        for (double a : x) {
            if (max < a) {
                max = a;
            }
        }
        return max;
    }

    public static String toUpper(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            s += ch;
        }
        return s;
    }

    public static String toLower(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            s += ch;
        }
        return s;
    }

    public static String toUpperFirstChar(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == 0) {
                continue;
            }
            char firstChar = words[i].charAt(0);
            String upperFirstChar = String.valueOf(firstChar).toUpperCase();
            words[i] = upperFirstChar + words[i].substring(1).toLowerCase();
        }
        return String.join(" ", words);
    }

    public static long getFibonacci(int position) {
        if (position <= 1) {
            return position;
        }
        long a = 0, b = 1, c = 0;
        for (int i = 2; i <= position; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
