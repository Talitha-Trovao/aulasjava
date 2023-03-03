// Desenvolva um programa que leia uma distância em metros e mostre os
// valores relativos em outras medidas.
// Ex: Digite uma distância em metros: 185.72
// A distância de 85.7m corresponde a:
// 0.18572Km
// 1.8572Hm
// 18.572Dam
// 1857.2dm
// 18572.0cm
// 185720.0mm

package Lista1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Lista1_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        JOptionPane.showInputDialog(null, "Digite o valor em metros:");
        double metro = scan.nextDouble();

        double cm = metro*(100);
        double km = metro*(0.001);

        JOptionPane.showMessageDialog(null, "A distancia de "+metro+"m corresponde a: "+cm+"cm, "+km+"km.");

        scan.close();
        
    }
    
}