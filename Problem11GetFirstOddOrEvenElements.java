import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Phoenix on 23.3.2016 г..
 */
public class Problem11GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] first = console.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < first.length; i++) {
            numbers.add(Integer.parseInt(first[i]));
        }
        String[] second = console.nextLine().split(" ");
        int firstElement = Integer.parseInt(second[1]);
        String evenOrOdd = second[2];
        evenOrOddElements(numbers, firstElement, evenOrOdd);
    }
    static int evenOrOddElements(List<Integer> numbers, int firstElement, String evenOrOdd){
        if (evenOrOdd.equals("even")){
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 == 0){
                    System.out.print(numbers.get(i) + " ");
                    firstElement--;
                }
                if (firstElement == 0){
                    System.exit(0);
                }
            }
        }else {
            for (int i = 0; i < numbers.size() ; i++) {
                if (numbers.get(i) % 2 != 0){
                    System.out.print(numbers.get(i) + " ");
                    firstElement--;
                    if (firstElement == 0){
                        System.exit(0);
                    }
                }
            }
        }
        return 1;
    }
}
