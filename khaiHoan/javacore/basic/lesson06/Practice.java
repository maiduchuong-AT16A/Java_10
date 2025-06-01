/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson06;

/**
 *
 * @author ACER
 */
public class Practice {
    public static final double getSum(double... x){
            double sum = 0;
            for(double i : x) {
                sum += i;
            }
        return sum;
    }
    
    public static final double getMin(double... x){
            double xMin = x[0];
            for(double i : x) {
                if(i < xMin) {
                    xMin = i;
                }
            }
        return xMin;
    }
    
    public static final double getMax(double... x){
        double xMax = x[0];
        for(double i : x) {
            if(i > xMax) {
                xMax = i;
            }
        }
        return xMax;
    }

    public static String toUpper(String str){
        String res = "";
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z') {
                res += (char)(c-32);
            } else {
                res += c;
            }
        }
        return res;
    }

    public static String toLower(String str){
        String res = "";
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'A' && c <= 'Z') {
                res += (char)(c+32);
            } else {
                res += c;
            }
        }
        return res;
    }

    public static String toUpperFirstChar(String str) {
        String[] words = str.split(" ");
        for(int i = 0; i < words.length; i++) {
            char firstChar = words[i].charAt(0);
            String upperFirstChar = String.valueOf(firstChar).toUpperCase();
            words[i] = upperFirstChar + words[i].substring(1).toLowerCase();
        }
        String res = String.join(" ", words);
        return res;
    }
    
    public static long getFibonacci(int position){
        if(position <= 2)
            return 1;
        return getFibonacci(position-1) + getFibonacci(position-2);
    }
}
