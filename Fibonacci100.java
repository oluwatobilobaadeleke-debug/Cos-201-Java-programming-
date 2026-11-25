import java.math.BigInteger;

public class Fibonacci100 {

    public static void main(String[] args) {

        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;

        System.out.println("First 100 numbers of the Fibonacci sequence:");

        for (int count = 1; count <= 100; count++) {
            System.out.print(first + " ");

            BigInteger next = first.add(second);
            first = second;
            second = next;
        }

        System.out.println();
    }
}
