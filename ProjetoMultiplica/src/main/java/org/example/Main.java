package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Insira o numero que deseja multiplicar");
        Scanner num = new Scanner(System.in);

        MultiplicaAi teste = new MultiplicaAi(num.nextInt());
        num.close();
        teste.multiplicar();
    }
}