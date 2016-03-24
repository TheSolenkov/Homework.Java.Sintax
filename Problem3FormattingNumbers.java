import com.sun.javafx.binding.StringFormatter;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Phoenix on 22.3.2016 г..
 */
public class Problem3FormattingNumbers {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        n.useLocale(Locale.ROOT);
        int a = n.nextInt();
        double b = n.nextDouble();
        double c = n.nextDouble();
        String first = Integer.toString(a, 16).toUpperCase();
        String second = Integer.toString(a, 2);
        String str2 = String.format("%10s", second).replace(' ', '0');
        System.out.print("|");
        System.out.print(String.format("%1$-10s", first));
        System.out.print("|");
        System.out.print(str2);
        System.out.print("|");
        System.out.print(String.format("%1$10s", String.format("%.2f", b)));
        System.out.print("|");
        System.out.print(String.format("%1$-10s", String.format("%.3f", c)));
        System.out.println("|");
        System.out.println();
    }
}
