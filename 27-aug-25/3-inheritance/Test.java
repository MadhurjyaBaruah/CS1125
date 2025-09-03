class Animal {
    void sound() { System.out.println("Animal makes sound"); }
}
class Dog extends Animal {
    void sound() { System.out.println("Dog barks"); }
}
class Cat extends Animal {
    void sound() { System.out.println("Cat meows"); }
}
class Cow extends Animal {
    void sound() { System.out.println("Cow moos"); }
}
class Test {
    public static void main(String[] args) {
        Animal a1 = new Dog(), a2 = new Cat(), a3 = new Cow();
        a1.sound(); a2.sound(); a3.sound();
    }
}
