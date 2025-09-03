class Animal {}
class Dog extends Animal {}
class Test3 {
    public static void main(String[] args) {
        Animal a = new Dog();
        System.out.println(a instanceof Dog);   
        System.out.println(a instanceof Animal); 
    }
}
