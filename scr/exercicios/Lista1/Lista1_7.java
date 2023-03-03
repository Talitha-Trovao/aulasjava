// Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a sua terça parte.
// Ex: Digite um número: 3.5 O dobro de 3.5 é 7.0 A terça parte de 3.5 é 1.16666


package Lista1;

import java.util.Scanner;

public class Lista1_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("informe um número:");
        double num =scan.nextDouble();

        double dobro = num*2;
        double terço = num/3;

        System.out.println("O dobro de "+num+ " é "+dobro+". A terça parte é "+terço);

        scan.close();
    }
    
}