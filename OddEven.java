package Homework;

public class OddEven {

    public static void main(String[] args) {
        int Number;
        sc = new Scanner(System.in);
        System.out.println("\n Please Enter any integer Value: ");
        Number = sc.nextInt();

        if (Number % 2 == 0) {
            System.out.println("\n You have entered EVEN Number");
        }
        else {
            System.out.println("\n You have entered ODD Number");
        }
    }
}
