// Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira
// (em R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 =
// R$3,45.


package Lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista1_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        System.out.println("Informe o valor em reais:");
        double real = scan.nextDouble();

        double dolar = real*(3.45);

        System.out.printf("O valor de R$"+df.format(real)+" equivale a $"+df.format(dolar)+".");

        scan.close();
    }
    
}