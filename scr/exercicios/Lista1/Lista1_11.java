// Desenvolva uma lógica que leia os valores de A, B e C de uma equação
// do segundo grau e mostre o valor de Delta.

package Lista1;

import java.util.Scanner;

public class Lista1_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        double delta, x1, x2;

        System.out.println("Ax²+Bx+C=0 - Digite o valor de A: ");
        a = scan.nextInt();

        System.out.println("Ax²+Bx+C=0 - Digite o valor de B: ");
        b = scan.nextInt();

        System.out.println("Ax²+Bx+C=0 - Digite o valor de C: ");
        c = scan.nextInt();
 
        delta = (b * b) + (-4 * (a * c));
 
        System.out.println("Delta: " + delta);
 
        if (delta >= 0) {
 
            x1 = ((-(b) + Math.sqrt(delta)) / 2 * a);
            x2 = ((-(b) - Math.sqrt(delta)) / 2 * a);
 
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
 
        } else {
            System.out.println("Delta não possui raiz!");
            System.exit(0);
        }


        scan.close();
        
    }
    
}