package javacore.basic.lesson06;

public class Practice {

    public static final double getSum(double... x) {
        double sum = 0;
        for (double temp : x) {
            sum += temp;
        }
        return sum;
    }

    public static final double getMin(double... x) {
        double min = x[0];
        for (int i = 0; i < x.length; i++) {
            if (min > x[i]) {
                min = x[i];
            }
        }
        return min;
    }

    public static final double getMax(double... x) {
        double max = x[0];
        for (int i = 0; i < x.length; i++) {
            if (max < x[i]) {
                max = x[i];
            }
        }
        return max;
    }

    public static String toUpper(String str) {
        String a = "";
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (str.charAt(i) <= 'z' && str.charAt(i) >= 'a') {
                c = (char) ((int) str.charAt(i) - 32);
            }
            a += c;
        }
        return a;
    }

    public static String toLower(String str) {
        String a = "";
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (str.charAt(i) <= 'Z' && str.charAt(i) >= 'A') {
                c = (char) ((int) str.charAt(i) + 32);
            }
            a += c;
        }
        return a;
    }

    public static String toUpperfirstChar(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == 0) {
                continue;
            }
            char firstChar = words[i].charAt(0);
            char upperFirstchar = String.valueOf(firstChar).toUpperCase().charAt(0);
            if (words[i].length() > 1) {
                words[i] = upperFirstchar + words[i].substring(1);
            } else {
                words[i] = String.valueOf(upperFirstchar);
            }
        }
        return String.join(" ", words);
    }

    public static long getFibonacci(int position) {
        if (position == 0) {
            return 0;
        } else if (position == 1 || position == 2) {
            return 1;
        } else if (position >= 3) {
            long a = 1;
            long b = 1;
            long c = 1;
            for (int i = 3; i <= position; i++) {
                a = b;
                b = c;
                c = a + b;
            }
            return c;
        }
        return 0;
    }
}
