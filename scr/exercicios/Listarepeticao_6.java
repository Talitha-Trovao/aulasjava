// Leia a idade de 20 pessoas e exiba a soma das idades.
package exercicios;
import java.util.Scanner;

public class Listarepeticao_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, soma, n;
        soma = 0;
        n = 0;
        i = 0;

        while(i<20){
            i = i++;
            System.out.println("Insira 20 idades de pessoas:");
            n = scan.nextInt();
            soma = soma + n;         
        }
        System.out.println("A soma das idades é:"+ soma);
        scan.close();
        
    }
    
}