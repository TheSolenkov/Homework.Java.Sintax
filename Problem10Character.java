import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by Phoenix on 23.3.2016 г..
 */
public class Problem10Character {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String first = console.nextLine();
        String second = console.nextLine();

        System.out.println(productMetod(first, second));
    }
       static int productMetod (String first, String second){
        int productInteger = 0;
           if (first.length() == second.length()){
               for (int i = 0; i <first.length() ; i++) {
                   productInteger += first.charAt(i) * second.charAt(i);

               }
           }else if (first.length() > second.length()){
               for (int i = 0; i < second.length(); i++) {
                   productInteger += first.charAt(i) * second.charAt(i);
               }
               for (int i = second.length(); i < first.length() ; i++) {
                   productInteger += first.charAt(i);
               }
           }else {
               for (int i = first.length(); i < second.length() ; i++) {
                   productInteger += second.charAt(i);
               }
               for (int i = 0; i < first.length(); i++) {
                   productInteger += first.charAt(i) * second.charAt(i);
               }
           }
           return productInteger;
    }
}
