// Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
// 80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso,
// exiba o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.

package exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        JOptionPane.showInputDialog(null,"Informe a velocidade do carro: ");
        int vel = scan.nextInt();

        if(vel>80){
            int multa = (vel-80) * 5;
            JOptionPane.showMessageDialog(null,"Você será multado em R$"+ multa);
        }
        else{
            JOptionPane.showMessageDialog(null,"Você não terá multa.");
        }
        scan.close();
    }
}
