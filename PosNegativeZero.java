package Homework;

public class PosNegativeZero {
    public static void main(String[] args)
    {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Number You Want to Check:");
        number = scan.nextInt();
        if(number > 0)
        {
            System.out.println("The Number Is "+number+" is Positive");
        }
        else if(number < 0);
        {
            System.out.println("The Number Is "+number+" is Negative");
        }
        else
        {
            System.out.println("The Number Is "+number+" is Zero ");
        }



    }


}
