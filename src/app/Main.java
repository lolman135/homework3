package app;

public class Main {
    static double fahrenheit, celsius;
    public static void main(String[] args) {
        System.out.println("Temperature converter");

        fahrenheit = 10;
        celsius = 10;

        System.out.println("Fahrenheit: " + fahrenheit + " ==> Celsius: " + fahrenheitToCelsius(fahrenheit));
    }
    private static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }
}
