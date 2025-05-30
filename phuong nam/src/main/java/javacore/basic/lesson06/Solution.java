
package javacore.basic.lesson06;

import java.util.Scanner;

/**
 *
 * @author Phuong Nam
 */
public class Solution {
		public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = Integer.parseInt(sc.nextLine()); // Số lượng test case
        
        for (int t = 1; t <= T; t++) {
            int n = Integer.parseInt(sc.nextLine());

            String[] tokens = sc.nextLine().trim().split(" ");
            double[] numbers = new double[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = Double.parseDouble(tokens[i]);
            }

            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine());

            // In kết quả
            System.out.println("Case #" + t + ":");
            System.out.printf("Sum: %.2f\n", Practice.sum(numbers));
            System.out.println("Min: " + Practice.getMin(numbers));
            System.out.println("Max: " + Practice.getMax(numbers));
            System.out.println("To upper: " + Practice.toUpper(str1));
            System.out.println("To lower: " + Practice.toLower(str2));
            System.out.println("To upper first char: " + 
                Practice.toUpperFirstChar(str1) + " - " + Practice.toUpperFirstChar(str2));
            System.out.println("Fibonacci(" + k + "): " + Practice.getFibonacci(k));
        }

        sc.close();
    }
}
