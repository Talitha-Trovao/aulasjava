
//Crie um algoritmo leia um número do usuário e exiba a sua tabuada de multiplicação. 

package Listarepeticao;

import java.util.Scanner;

public class Listarepeticao_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        String tabuada = "";
        int i = 1;

        System.out.println("Insira um número para tabuada:");
        num = scan.nextInt();

        for( i=1; i<=10; i++){
           System.out.println(tabuada = num +"x" + i +"=" + (num*i) + "\n"); 

        }
        scan.close();
    }
    
}
