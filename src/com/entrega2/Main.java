package com.entrega2;

import java.util.Scanner;

public class Main {
    public static double calculate(int num){
        return num+(num*0.21);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero: ");

        int precio = scanner.nextInt();

        System.out.println("precio con iva: "+calculate(precio));
    }
}
