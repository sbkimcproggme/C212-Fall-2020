// This program is to extend the value of Fibonacci series to indefinite range.
import java.io.PrintStream;
import java.math.BigInteger;

public class modifiedHomework1 {

    public static void main(String[] args) {

        BigInteger numb1 =  BigInteger.valueOf(1);
        BigInteger numb2 =  BigInteger.valueOf(1);
        BigInteger res;
        int ind = 2;

        System.out.println("\n");
        System.out.printf("This is #1 Fibonacci number %d", 1);
        System.out.println("\n");
        System.out.printf("This is #2 Fibonacci number %d", 1);

        while(ind>=2) {
            res = numb1.add(numb2);
            numb1 = numb2;
            numb2 = res;
            ind += 1;
            System.out.println("\n");
            System.out.printf("This is #%d Fibonacci number ", ind);
            System.out.println(res);
        }
    }
}
