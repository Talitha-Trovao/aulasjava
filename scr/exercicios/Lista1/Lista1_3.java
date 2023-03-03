//Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem.
//Ex: Nome do Funcionário: Maria do Carmo Salário: 1850,45 O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.

package Lista1;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Lista1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = JOptionPane.showInputDialog(null, "Informe seu nome");

        JOptionPane.showInputDialog(null,"Informe seu salário:");
        double salario = scan.nextDouble();

        JOptionPane.showMessageDialog(null,"O salário de  " + nome +" é "+ salario + "reais mensais.");
        scan.close();
    }    
}