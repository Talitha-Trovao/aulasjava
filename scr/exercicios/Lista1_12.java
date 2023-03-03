// Crie um programa que leia o preço de um produto, calcule e mostre o
// seu PREÇO PROMOCIONAL, com 5% de desconto.


package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista1_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        System.out.println("Digite o valor do produto em reais: ");
        double valor = scan.nextDouble();

        double valor_desc = valor*(0.95);

        System.out.println("O valor R$"+df.format(valor)+" com desconto de 5% é R$"+df.format(valor_desc));

        scan.close();
        
    }
    
}