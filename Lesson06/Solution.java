/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson06;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 1; t <= T; t++) {
            int n = scanner.nextInt();
            double[] arr = new double[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextDouble();
            }
            scanner.nextLine();
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            int k = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Case #" + t + ":");
            System.out.printf("Tong: %.2f\n", Practice.getSum(arr));
            System.out.println("Nho nhat: " + Practice.getMin(arr));
            System.out.println("Lon nhat: " + Practice.getMax(arr));
            System.out.println("Chu hoa: " + Practice.toUpper(str1));
            System.out.println("Chu thuong: " + Practice.toLower(str2));
            System.out.println("Viet hoa chu dau: " + Practice.toUpperFirstChar(str1) + " - " + Practice.toUpperFirstChar(str2));
            System.out.println("Fibonacci(" + k + "): " + Practice.getFibonacci(k));
        }
        scanner.close();
    }
}
