// Problem 2

package tasksfour;
import java.util.Scanner;
public class Voter {
    private int voterid;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "{" +
                "voterid=" + voterid +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Voter(int voterid, String name, int age) throws AgeNotWithinRangeException {
        this.voterid = voterid;
        this.name = name;
        if(age < 18) {
            throw new AgeNotWithinRangeException("Invalid age for voter");
        }
        this.age = age;
    }

    public static void main(String[] args) throws AgeNotWithinRangeException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Voter ID : ");
        int voterid = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name : ");
        String name = scanner.nextLine();
        System.out.print("Enter Age : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        Voter voter = new Voter(voterid, name, age);
        System.out.println(voter.toString());
    }
}