import java.util.Scanner;

class Student2 {
    String name;
    int id, marks;

    void input(Scanner sc) {
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("ID: ");
        id = sc.nextInt();
        System.out.print("Marks: ");
        marks = sc.nextInt();
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student2 s = new Student2();
        s.input(sc);
        s.display();
        sc.close();  
    }
}
