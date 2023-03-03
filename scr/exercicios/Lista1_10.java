// Faça um algoritmo que leia a largura e altura de uma parede, calcule e
// mostre a área a ser pintada e a quantidade de tinta necessária para o
// serviço, sabendo que cada litro de tinta pinta uma área de 2metros
// quadrados.


package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista1_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.0");

        System.out.println("Informe a altura da parede em metros:");
        double alt = scan.nextDouble();

        System.out.println("Informe a largura da parede em metros:");
        double larg = scan.nextDouble();

        double area = alt*larg;

        double v_tinta = area/2;

        System.out.println("Para pintar uma área de "+df.format(area)+"m², é preciso "+df.format(v_tinta)+" litros de tinta.");

        scan.close();
        
    }
    
}