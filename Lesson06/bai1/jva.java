/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author manh
 */
public class jva {

    public static final double sum(double[] x) {
        double s = 0;
        for (double a1 : x) {
            s += a1;
        }
        return s;

    }

    public static final double getMin(double... arr) {
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static final double getMax(double... arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static String toUpperCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
            }
            result = result + c;
        }
        return result;
    }

    public static String toLowerCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32);
            }
            result = result + c;
        }
        return result;
    }

    public static String toUpperfirstchar(String str) {
        str = str.trim().toLowerCase();
        String[] word = str.split("\\s+");
        String result = "";
        for (int i = 0; i < word.length; i++) {
            char firstchar = word[i].charAt(0);
            char upperFirstChar = Character.toUpperCase(firstchar);
            word[i] = upperFirstChar + word[i].substring(1);
            result = result + word[i];
            if (i != word.length - 1) {
                result = result + " ";
            }
        }
        return result;
    }

    public static long getFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);

    }

    public static long khongdequy(int n) {
        long a = 0;
        long b = 1;
        for (int i = 0; i < n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

}
