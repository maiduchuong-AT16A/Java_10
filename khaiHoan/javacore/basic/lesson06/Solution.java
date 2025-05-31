/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson06;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            System.out.println("Case #"+(i+1)+":");
            int n = sc.nextInt();
            double str[] = new double[n];
            for(int j = 0; j < n; j++) {
                str[j] = sc.nextDouble();
            }
            sc.nextLine();
            
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            int k = sc.nextInt();
            
            System.out.printf("Sum: %.2f\n", Practice.getSum(str));
            System.out.printf("Min: %.1f\n", Practice.getMin(str));
            System.out.printf("Max: %.1f\n", Practice.getMax(str));
            System.out.println("To upper: " + Practice.toUpper(str1));
            System.out.println("To lower: " + Practice.toLower(str2));
            System.out.println("To upper first char: " + Practice.toUpperFirstChar(str1) + " - " + Practice.toUpperFirstChar(str2));
            System.out.println("Fibonacci(" + k + "): " + Practice.getFibonacci(k));
        }
    }
}
