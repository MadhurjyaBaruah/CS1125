class Person {
    String name; int age;
    Person(String n, int a) { name = n; age = a; }
}
class Teacher extends Person {
    String subject; double salary;
    Teacher(String n, int a, String s, double sal) {
        super(n, a); subject = s; salary = sal;
    }
    void display() {
        System.out.println(name + ", " + age + ", " + subject + ", " + salary);
    }
    public static void main(String[] args) {
        Teacher t = new Teacher("ABC", 24, "Java", 25000);
        t.display();
    }
}
