import java.util.Random;
import java.util.Scanner;

public class DiceRollar {
    public static void main(String[] args) {
        Random gen = new Random();
        Scanner in = new Scanner(System.in);
        boolean isTriple = false;
        System.out.println("Roll   Die1   Die2   Die3   Sum");
        System.out.println("________________________________");
        int rollCount = 0;
        while (!isTriple) {
            rollCount++;
            int val1 = gen.nextInt(6) + 1;
            int val2 = gen.nextInt(6) + 1;
            int val3 = gen.nextInt(6) + 1;
            int sum = val1 + val2 + val3;
            System.out.println(rollCount + "      " + val1 + "      " + val2 + "      " + val3 + "      " + sum);
            if ((val1 == val2) && (val2 == val3)) {
                isTriple = true;
                System.out.println("Triples! Want to try again? ");
                if (in.hasNext("y") || (in.hasNext("Y"))) {
                    isTriple = false;
                    System.out.println("Great! Restarting rolls...");
                    rollCount = 0;
                    in.nextLine();
                }
                else{
                    System.out.println("Thanks for playing!");
                }
            }
        }
    }
}
