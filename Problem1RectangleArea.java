import java.util.Scanner;

/**
 * Created by Phoenix on 20.3.2016 г..
 */
public class Problem1RectangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int result = a * b;
        System.out.print("Result is: ");
        System.out.println(result);
    }
}
