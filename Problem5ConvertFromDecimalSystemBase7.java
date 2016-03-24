import java.util.Scanner;

/**
 * Created by Phoenix on 22.3.2016 г..
 */
public class Problem5ConvertFromDecimalSystemBase7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer number = console.nextInt();
        System.out.println(Integer.toString(number, 7));
    }
}
