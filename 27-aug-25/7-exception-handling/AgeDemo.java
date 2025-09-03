import java.util.Scanner;
class AgeException extends Exception {
    AgeException(String msg) { super(msg); }
}
class AgeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            if(age < 18) throw new AgeException("Age must be 18 or above");
            System.out.println("Valid age: " + age);
        } catch(AgeException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
