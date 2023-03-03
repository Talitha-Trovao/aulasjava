package exercicios;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Exerciciosaula3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
            JOptionPane.showInputDialog("Insira o valor do produto: ");
            double valor = scan.nextDouble();
            
            JOptionPane.showInputDialog("Digite a porcentagem de desconto: ");
            double desconto = scan.nextDouble();

            if (0 < desconto && desconto <= 100) {
                double resultado = valor - (valor * desconto/100);
                JOptionPane.showMessageDialog(null,"O desconto de " + desconto +"% sobre "+ valor + " é: "+ resultado);
            }
            else{
                JOptionPane.showMessageDialog(null,"O desconto é inválido.");
            }
            scan.close();


    }
}

/* 1 - Crie uma classe que receba o valor de um produto e a 
        porcentagem de desconto, calcule e mostre o valor do desconto 
        e o valor do produto com o desconto. Observação: o valor do desconto 
        é calculado por meio da fórmula: valor do desconto = valor do produto * percentual de desconto / 100. 
*/



