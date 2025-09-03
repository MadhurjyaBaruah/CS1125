import java.util.Scanner;
class DivisionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter two numbers: ");
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println("Result: " + (a/b));
        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        sc.close();
    }
}
