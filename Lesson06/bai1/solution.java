/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

import java.util.Scanner;
import static practice.jva.getFibonacci;
import static practice.jva.getMax;
import static practice.jva.getMin;
import static practice.jva.sum;
import static practice.jva.toLowerCase;
import static practice.jva.toUpperCase;
import static practice.jva.toUpperfirstchar;

/**
 *
 * @author manh
 */
public class solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so test case ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("=================================");
            System.out.println("Case #" + i);
            System.out.println("so luong phan tu mang la: ");
            int t = sc.nextInt();
            double[] m = new double[t];
            System.out.println("cac phan tu cua mang la ");
            for (int j = 0; j < t; j++) {
                m[j] = sc.nextDouble();
            }
            sc.nextLine();
            System.out.println("chuoi 1 la:");
            String b = sc.nextLine();
            System.out.println("chuoi 2 la:");
            String c = sc.nextLine();
            System.out.println("day bonaci la: ");
            int a = sc.nextInt();
            System.out.println(sum(m));
            System.out.println(getMin(m));
            System.out.println(getMax(m));
            System.out.println("to upper: " + toUpperCase(b));
            System.out.println("to lower: " + toLowerCase(c));
            System.out.println("to upper first char: " + toUpperfirstchar(b) + "-" + toUpperfirstchar(c));
            System.out.printf("Fibonacci(%d):%d\n", a, getFibonacci(a));
        }
    }
}
