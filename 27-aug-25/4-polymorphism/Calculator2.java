class Calculator2 {
    int multiply(int a, int b) { return a * b; }
    double multiply(double a, double b) { return a * b; }
    public static void main(String[] args) {
        Calculator2 c = new Calculator2();
        System.out.println(c.multiply(5, 3));
        System.out.println(c.multiply(2.5, 4.0));
    }
}
