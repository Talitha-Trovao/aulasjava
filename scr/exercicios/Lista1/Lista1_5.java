// Faça um programa que leia as duas notas de um aluno em uma matéria
// e mostre na tela a sua média na disciplina.
// Ex: Nota 1: 4.5 Nota 2: 8.5 A média entre 4.5 e 8.5 é igual a 6.5

package Lista1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lista1_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        JOptionPane.showInputDialog(null, "Primeira nota:");
        double nota1 = scan.nextDouble();

        JOptionPane.showInputDialog(null, "Segunda nota:");
        double nota2 = scan.nextDouble();

        double media = (nota1+nota2)/2;

        JOptionPane.showMessageDialog(null, "A média das notas" + nota1 + " e " + nota2+" é "+ media);

        scan.close();

        
    }
    
}