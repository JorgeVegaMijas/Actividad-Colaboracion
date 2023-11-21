package jav;

import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("dime la base del triángulo");
        int base = sc.nextInt();
        
        System.out.println("dime la altura del triangulo");
        int altura = sc.nextInt();
    
        int resultado = (base * altura) /2;

        System.out.println("el area del triangulo es: " + resultado);
    }
}
