package br.senai.sp.jandira;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado;
        teclado = new Scanner(System.in);

        Random aleatorio = new Random();

        System.out.println("Bem vindo(a), comece já sua roleta");
        System.out.println("Escolha um número de 0 até 50");
        int resposta = teclado.nextInt();

        int number = aleatorio.nextInt(51);
        System.out.println("Número sorteado: " + number);

        if (number == resposta){
            System.out.println("Parabéns!!!");
            System.out.println("Você acertou o número =)");
        } else {
            System.out.println("Que pena!!!");
            System.out.println("Você perdeu =( ");
        }
    }
}
