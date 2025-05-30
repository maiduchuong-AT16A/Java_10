package javacore.basic.lesson06;

public class Practice {

    public static final double sum(double... x) {
        double total = 0;
        for (double value : x) {
            total += value;
        }
        return total;
    }

    public static final double getMin(double... x) {
        double min = x[0];
        for (double value : x) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static final double getMax(double... x) {
        double max = x[0];
        for (double value : x) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static String toUpper(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static String toLower(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static String toUpperFirstChar(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                char firstChar = words[i].charAt(0);
                String upperFirstChar = String.valueOf(firstChar).toUpperCase();
                words[i] = upperFirstChar + words[i].substring(1).toLowerCase();

            }
        }
        return String.join(" ", words);
    }

    public static long getFibonacci(int position) {
        if (position <= 2) {
            return 1;
        }
        return getFibonacci(position - 1) + getFibonacci(position - 2);
    }
}
