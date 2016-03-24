import java.util.*;

/**
 * Created by Phoenix on 22.3.2016 г..
 */
public class Problem7RandomizeNumbersFromNToM {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int M = console.nextInt();

        Random rnd = new Random();
        for (int i = Math.min(N, M); i <= Math.max(N, M); i++) {
            int range = Math.abs(N - M + 1);
            int randomNumber = rnd.nextInt(range) + Math.min(N, M);


        }
        List<Integer> numbers = new ArrayList<>();

        for (int i = Math.min(N, M); i <= Math.max(N, M); i++) {
            numbers.add(i);
            Collections.shuffle(numbers);
        }
        for (int item : numbers) {
            System.out.print(item + " ");
        }
    }
}
