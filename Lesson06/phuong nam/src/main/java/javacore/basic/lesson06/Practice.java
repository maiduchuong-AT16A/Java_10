
package javacore.basic.lesson06;

public class Practice {
	 public static double sum(double... x) {
        double result = 0;
        for (double tong : x) {
            result += tong;
        }
        return result;
    }

    public static double getMin(double... x) {
        double min = x[0];
        for (double nho : x) {
            if (nho < min) {
                min = nho;
            }
        }
        return min;
    }

    public static double getMax(double... x) {
        double max = x[0];
        for (double lon : x) {
            if (lon > max) {
                max = lon;
            }
        }
        return max;
    }

    public static String toUpper(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);  
            }
            result += ch;
        }
        return result;
    }

    public static String toLower(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result += ch;
        }
        return result;
    }

    public static String toUpperFirstChar(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                char firstChar = words[i].charAt(0);
                char upperFirstChar = String.valueOf(firstChar).toUpperCase().charAt(0);
                if (words[i].length() > 1) {
                    words[i] = upperFirstChar + words[i].substring(1).toLowerCase();
                } else {
                    words[i] = String.valueOf(upperFirstChar);
                }
            }
        }
        return String.join(" ", words);
    }

    public static long getFibonacci(int position) {
        if (position == 0) return 0;
        if (position == 1) return 1;
        return getFibonacci(position - 1) + getFibonacci(position - 2);
	}
}
