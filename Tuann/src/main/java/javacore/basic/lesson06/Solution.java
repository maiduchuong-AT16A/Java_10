package javacore.basic.lesson06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("D:\\Code Java_NetBean\\Tuann\\input.txt"));

            int T = Integer.parseInt(sc.nextLine().trim());
            for (int t = 1; t <= T; t++) {
                int n = Integer.parseInt(sc.nextLine().trim());
                double[] arr = new double[n];
                String[] tokens = sc.nextLine().trim().split(" ");
                for (int i = 0; i < n; i++) {
                    arr[i] = Double.parseDouble(tokens[i]);
                }

                String str1 = sc.nextLine().trim();
                String str2 = sc.nextLine().trim();
                int k = Integer.parseInt(sc.nextLine().trim());

                double sum = Practice.sum(arr);
                double min = Practice.getMin(arr);
                double max = Practice.getMax(arr);
                String upperStr1 = Practice.toUpper(str1);
                String lowerStr2 = Practice.toLower(str2);
                String capitalizedBoth = Practice.toUpperFirstChar(str1) + " - " + Practice.toUpperFirstChar(str2);
                long fib = Practice.getFibonacci(k);

                System.out.printf("Case #%d:\n", t);
                System.out.printf("Sum: %.2f\n", sum);
                System.out.printf("Min: %.6f\n", min);
                System.out.printf("Max: %.6f\n", max);
                System.out.println("To upper: " + upperStr1);
                System.out.println("To lower: " + lowerStr2);
                System.out.println("To upper first char: " + capitalizedBoth);
                System.out.println("Fibonacci(" + k + "): " + fib);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file input.txt");
        }
    }
}
