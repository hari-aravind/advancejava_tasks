package exceptions_and_collections;
// Problem 5

package tasksfour;
import java.util.Scanner;
import java.util.Stack;
public class StackOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        boolean isQuit = false;
        while(!isQuit) {
            System.out.println("1. Push Elements to Stack");
            System.out.println("2. Remove Elements from Stack");
            System.out.println("3. Display all Elements");
            System.out.println("Press 0 to quit");
            System.out.println("------------------------------------------");
            int n = scanner.nextInt();
            scanner.nextLine();

            if(n == 1) {
                System.out.print("Enter How many elements you want to push in Stack ? (eg : 10) : ");
                int count = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter elements one by one : ");
                for (int i = 0; i < count; i++) {
                    int number = scanner.nextInt();
                    stack.push(number);
                }
                System.out.println("******** Elements added to Stack *************");
            } else if (n == 2) {
                removeElementsFromStack(stack);
            } else if (n == 3) {
                System.out.println("Stack Elements : ");
                for (Integer i : stack) {
                    System.out.println(i);
                }
            } else if ( n == 0) {
                isQuit = true;
                scanner.close();
            } else {
                System.out.println("Press valid key or 0 to quit");
            }
        }
    }

    private static void removeElementsFromStack(Stack<Integer> stack) {
        if(!stack.isEmpty()) {
            stack.pop();
            System.out.println("Element removed from stack");
        }
        else {
            System.out.println("You can't delete any because Stack is empty");
        }
    }

}