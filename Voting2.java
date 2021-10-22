package Homework;

public class Voting2 {

    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print(“Enter age:”);

        age = sc.nextInt();
        if (age < 18)
            System.out.println(“Not eligible to vote”);
        else
            System.out.println(“eligible to vote”);
    }
}
