// Problem 1

package tasksfour;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Roll No. : ");
        int rollNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Student Name : ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Age : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Student Course Name : ");
        String course = scanner.nextLine();

        Student student = new Student(rollNo, name, age, course);
        try{
            checkAge(student.age);
            checkName(student.name);
        } catch (AgeNotWithinRangeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (NameNotValidException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (NameNotValidContainSpecialCharsException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Exceptions Checked");
        }
    }

    static void checkAge (int age) throws AgeNotWithinRangeException{
        if(age < 18){
            // throw user defined exception
            throw new AgeNotWithinRangeException("Age is not valid");
        }
    }

    static void checkName (String name) throws NameNotValidException, NameNotValidContainSpecialCharsException {
        // Create a Pattern object
        Pattern p = Pattern.compile("[0-9]");
        // Create a Matcher object
        Matcher m = p.matcher(name);
        // Check if the string contains any special characters
        boolean notValidName = m.find();
        if(notValidName){
            // throw user defined exception
            throw new NameNotValidException("Name Contains Numbers so Not a valid name");
        }


        Pattern p1 = Pattern.compile("[^a-zA-Z0-9]");
        Matcher m1 = p1.matcher(name);
        boolean notValidName1 = m1.find();
        if(notValidName1){
            throw new NameNotValidContainSpecialCharsException("Avoid Special Characters. Not a valid name.");
        }


    }
}