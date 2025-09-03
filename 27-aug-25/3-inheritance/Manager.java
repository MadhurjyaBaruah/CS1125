class Person2 {
    Person2() { System.out.println("Person constructor"); }
}
class Employee extends Person2 {
    Employee() { super(); System.out.println("Employee constructor"); }
}
class Manager extends Employee {
    Manager() { super(); System.out.println("Manager constructor"); }
    public static void main(String[] args) {
        new Manager();
    }
}
