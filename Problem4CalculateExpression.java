import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Phoenix on 22.3.2016 г..
 */
public class Problem4CalculateExpression {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        console.useLocale(Locale.ROOT);
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        double result = (Math.pow(a, 2) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2));
        double result2 = (a + b + c) / (Math.sqrt(c));
        double totalResult = (Math.pow(result, result2));
        System.out.printf("F1 result is: " + "%.2f\n" ,totalResult);

        double resultTwo = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3));
        double resultTwo2 = a - b;
        double totalResult2 = Math.pow(resultTwo, resultTwo2);
        System.out.printf("F2 result is: " + "%.2f" ,totalResult2);
        System.out.println();

        double averageNumers = (a + b + c) / 3;
        double average = (totalResult + totalResult2) / 2;
        double totalAverage = (average - averageNumers);
        System.out.printf("Diff: " + "%.2f", totalAverage);
    }
}
