abstract class Appliance {
    abstract void start();
}
class Fan extends Appliance {
    void start() { System.out.println("Fan started"); }
}
class WashingMachine extends Appliance {
    void start() { System.out.println("Washing machine started"); }
}
class Test4 {
    public static void main(String[] args) {
        new Fan().start();
        new WashingMachine().start();
    }
}
