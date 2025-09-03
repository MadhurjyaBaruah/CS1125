import java.util.Scanner;
class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Roll No: ");
        int roll = sc.nextInt();
        System.out.print("Enter 3 marks: ");
        int m1 = sc.nextInt(), m2 = sc.nextInt(), m3 = sc.nextInt();
        int total = m1 + m2 + m3;
        double avg = total / 3.0;
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Total: " + total + ", Average: " + avg);
        sc.close();
    }
}
