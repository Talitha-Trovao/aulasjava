// A locadora de carros precisa da sua ajuda para cobrar seus serviços.
// Escreva um programa que pergunte a quantidade de Km percorridos por
// um carro alugado e a quantidade de dias pelos quais ele foi alugado.
// Calcule o preço total a pagar, sabendo que o carro custa R$90 por dia e
// R$0,20 por Km rodado.

package exercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lista1_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        System.out.println("Dias de aluguel:");
        int dias = scan.nextInt();

        System.out.println("Km total rodados:");
        double km = scan.nextDouble();

        double total = (dias*90) + (km*0.2);

        System.out.println("O valor total do aluguel custa R$"+df.format(total));

        scan.close();

        
    }
    
}