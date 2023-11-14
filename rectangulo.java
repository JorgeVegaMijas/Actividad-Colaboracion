package jav;

import java.util.Scanner;

public class rectangulo {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("dime la base del rectangulo");
        int base = sc.nextInt();
        
        System.out.println("dime la altura del rectangulo");
        int altura = sc.nextInt();
    
        int resultado = base * altura;

        System.out.println("el area del rectangulo es: " + resultado);
    }
}
