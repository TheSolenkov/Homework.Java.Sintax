import java.util.Scanner;

/**
 * Created by Phoenix on 22.3.2016 г..
 */
public class Problem6ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sevenBase = Integer.parseInt(console.nextLine(), 7);
        String result = Integer.toString(sevenBase, 10);
        System.out.println(result);
    }
}
