// Leia a idade de 20 pessoas e exiba a média das idades. 
package Listarepeticao;
import java.util.Scanner;

public class Listarepeticao_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, media, n, soma;
        media = 0;
        soma = 0;
        n = 0;
        i = 0;

        while(i<20){
            i = i++;
            System.out.println("Insira 20 idades de pessoas (uma por vez):");
            n = scan.nextInt();
            soma = soma + n;
            media = soma/20;        
        }
        media = soma/20;
        System.out.println("A media das idades é:"+ media);
        scan.close();
        
    }
    
}