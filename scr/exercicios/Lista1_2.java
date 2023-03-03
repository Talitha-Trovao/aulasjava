// Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
// Ex: Qual é o seu nome? João da Silva Olá João da Silva, é um prazer te conhecer!

package exercicios;

import javax.swing.JOptionPane;

public class Lista1_2 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null,"Informe seu nome:");

        JOptionPane.showMessageDialog(null,"Bem vindo, " + nome +"!");
    }
}