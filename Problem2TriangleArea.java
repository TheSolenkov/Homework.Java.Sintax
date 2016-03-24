import java.util.Scanner;

/**
 * Created by Phoenix on 20.3.2016 г..
 */
public class Problem2TriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String number = console.nextLine();
        String[] aA = number.split(" ");
        String bA = console.nextLine();
        String[] aB = bA.split(" ");
        String bB = console.nextLine();
        String[] aC = bB.split(" ");
        String bC = console.nextLine();
        int firstA = Integer.parseInt(aA[0]);
        int secondA = Integer.parseInt(aA[1]);
        int firstB = Integer.parseInt(aB[0]);
        int secondB = Integer.parseInt(aB[1]);
        int firstC = Integer.parseInt(aC[0]);
        int secondC = Integer.parseInt(aC[1]);

        int result = (firstA * (secondB - secondC) +
                firstB * (secondC - secondA) +
                firstC * (secondA - secondB)) / 2;

        if (result > 0) {
            System.out.println(result);
        } else {
            System.out.println(result * (-1));
        }
    }
}
