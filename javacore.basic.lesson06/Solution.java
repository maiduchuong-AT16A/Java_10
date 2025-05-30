
import java.util.Scanner;

import javacore.basic.lesson06.Practice;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 1;
        for (int i = t; i > 0; i--) {
            int n = sc.nextInt();
            double a[] = new double[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextDouble();
            }
            sc.nextLine();

            String str1 = sc.nextLine();

            String str2 = sc.nextLine();

            int k = sc.nextInt();

            System.out.printf("CASE #%d:\n", count++);
            System.out.println("Sum: " + Practice.getSum(a));
            System.out.println("Min: " + Practice.getMin(a));
            System.out.println("Max: " + Practice.getMax(a));
            System.out.println("To upper: " + Practice.toUpper(str1));
            System.out.println("To lower: " + Practice.toLower(str2));
            System.out.println("To upper first char: " + Practice.toUpperfirstChar(str1) + " - "
                    + Practice.toUpperfirstChar(str2));
            System.out.printf("Fibonaci(%d): %d", k, Practice.getFibonacci(k));
        }
    }
}