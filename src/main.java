import java.util.Scanner;

public class main {


    public static void main(String[] args){
        FareCalculator fc = new FareCalculator();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter in the number of blocks: ");
        int inputblocks = s.nextInt();

        double result = fc.CalculateFare(inputblocks);
        System.out.println("You owe: " + result + " including tip");

    }
}
