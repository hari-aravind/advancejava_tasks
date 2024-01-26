// Problem 3

package tasksfour;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<String> weekdays = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        System.out.print("Enter a number (0-6) to display a day : ");
        int n = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        try {
            if(n > weekdays.size() - 1) {
                throw new ArrayIndexOutOfBoundsException("Wrong Day Choosed!");
            }
            if(n < weekdays.size()) {
                for (int i = 0; i < weekdays.size(); i++) {
                    if(i == n) {
                        System.out.println(weekdays.get(i));
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}