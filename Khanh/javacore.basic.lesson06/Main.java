import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {

            int n = sc.nextInt();
            double a[] = new double[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextDouble();
            }

            sc.nextLine();

            String str = sc.nextLine();
            String str2 = sc.nextLine();
            int k = sc.nextInt();

            System.out.println("Case #" + t + ":");
            System.out.println("Sum: "+Practice.getSum(n, a));
            System.out.println("Min: "+Practice.getMin(n, a));
            System.out.println("Max: "+Practice.getMax(n, a));
            System.out.println("To upper: " +Practice.toUpper(str));
            System.out.println("To lower: " + Practice.toLower(str2));
            System.out.println("To upper first char: " + Practice.toUpperFirstChar(Practice.toLower(str)) + " - " + Practice.toUpperFirstChar(Practice.toLower(str2)));
            System.out.println("Fibonacci(" + k + "): " + Practice.getFibonacci(k));


            

            t--;
        }

    }
}
