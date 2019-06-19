
package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("informe o peso");
        double peso = leia.nextDouble();
        
        System.out.println("informe a altura");
        double altura = leia.nextDouble();
        
        double resultado = peso / (altura * altura);
        System.out.println(resultado);
    }
}
