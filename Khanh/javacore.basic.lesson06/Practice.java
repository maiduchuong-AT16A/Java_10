

public class Practice {

    public static final double getSum(int n, double a[]) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static final double getMin(int n, double a[]) {
        double min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static final double getMax(int n, double a[]) {
        double max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static final String toUpper(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char kitu = str.charAt(i);
            if (kitu >= 'a' && kitu <= 'z') {
                kitu = (char) (kitu - 32);
            }
            result += kitu;
        }
        return result;
    }
    

    public static final String toLower(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char kitu = str.charAt(i);
            if (kitu >= 'A' && kitu <= 'Z') {
                kitu = (char) (kitu + 32);
            }
            result += kitu;
        }
        return result;
    }

    static public final String toUpperFirstChar(String str) {
        String word[] = str.split(" ");
        for (int i = 0; i < word.length; i++) 
        {
            char firstChar = word[i].charAt(0);
            String upperFirstChar = String.valueOf(firstChar).toUpperCase();
            word[i] = upperFirstChar + word[i].substring(1);
        }
        String result = String.join(" ", word);
        return result;
    }
    
    public static long getFibonacci(int position)
    {
            if ( position == 0 ) return 0 ;
            if (position == 1 ) return 1 ; 
            return getFibonacci(position -1) + getFibonacci(position - 2); 
    }

}
