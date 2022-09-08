package util;

public class Calculator {
    public static final double PI = 3.14159;

    public static double area(double raio){
        return PI * raio * raio;
    }

    public static double volume(double raio){
        return 4.0 * PI * raio * raio * raio / 3.0;
    }
}
