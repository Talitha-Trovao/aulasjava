// Desenvolva um algoritmo que leia dois números inteiros e mostre o
// somatório entre eles.
// Ex: Digite um valor: 8 Digite outro valor: 5 A soma entre 8 e 5 é igual a 13.

package exercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lista1_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        JOptionPane.showInputDialog(null, "informe um numero:");
        int num_1 = scan.nextInt();

        JOptionPane.showInputDialog(null, "informe mais um numero:");
        int num_2 = scan.nextInt();

        int soma = num_1+num_2;
        
        JOptionPane.showMessageDialog(null, "A soma de "+num_1+"+"+num_2+ "="+soma+"." );
        scan.close();
    }
    
}