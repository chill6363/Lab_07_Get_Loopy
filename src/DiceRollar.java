import java.util.Random;

public class DiceRollar {
    public static void main(String[] args) {
        Random gen = new Random();
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
            if ((val1 == val2) && (val2 == val3)) {
                isTriple = true;
            }
            System.out.println(rollCount + "      " + val1 + "      " + val2 + "      " + val3 + "      " + sum);
        }
    }
}
