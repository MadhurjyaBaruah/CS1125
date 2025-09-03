class TemperatureConverter {
    double celsiusToFahrenheit(double c) { return (c * 9/5) + 32; }
    double fahrenheitToCelsius(double f) { return (f - 32) * 5/9; }
    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter();
        System.out.println("25°C = " + tc.celsiusToFahrenheit(25) + "°F");
        System.out.println("77°F = " + tc.fahrenheitToCelsius(77) + "°C");
    }
}
