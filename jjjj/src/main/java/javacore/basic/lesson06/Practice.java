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
    public static final double sum(double...x){
        double s = 0;
        for(double i : x){
            s += i;
        }
        return s;
    }
    public static final double getMin(double...x){
        double min = x[0];
        for(double i : x){
            if(i < min){
                min = i;
            }
        }
        return min;
    }
    public static final double getMax(double...x){
        double max = x[0];
        for(double i : x){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
    
    public static String toUpper (String str){
        StringBuilder ketQua = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                ketQua.append((char)(ch - 32));
            }else{
                ketQua.append(ch);
            }
        }
        return ketQua.toString();
    }
    public static String toLower(String str){
        StringBuilder ketQua = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(ch >= 'A' && ch <= 'Z'){
                ketQua.append((char)(ch + 32));
            }else{
                ketQua.append(ch);
            }
        }
        return ketQua.toString();
    }
    
}
