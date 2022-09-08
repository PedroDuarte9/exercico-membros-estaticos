package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio:  ");
        double raio = sc.nextDouble();

        double a = Calculator.area(raio); //Boa Prática, declarar uma variável para receber o método da outra classe

        double v = Calculator.volume(raio);

        System.out.printf("Valor da area %.2f%n" , a);

        System.out.printf("Valor do volume %.2f%n " , v);

        System.out.println("Valor de PI :" + Calculator.PI);
        sc.close();
    }

}
