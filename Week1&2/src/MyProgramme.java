import java.util.Scanner;

public class MyProgramme {

    public static float bigger(int x1, int x2){
        return ((Math.abs(x1-x2) + (x1+x2))/2);
    }

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("What is your first number? \n");
    int a = input.nextInt();
    System.out.print("What is your second number? \n");
    int b = input.nextInt();

    int res = (int)bigger(a, b);
        // Float type will be automatically converted into Integer type.
    System.out.printf("The largest between %d and %d is: %d", a, b, res);
    }
}