import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int birthMonth = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number for your birth month: ");
        if(in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine();
        }
        if (birthMonth >=1 && birthMonth <=12 ){
            System.out.println("Your birth month is: " + birthMonth);
        }
        else {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}