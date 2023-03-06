// Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
// média e mostre na tela. No final, analise a média e mostre se o aluno teve ou não
// um bom aproveitamento (se ficou acima da média 7.0).

package Lista3;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome ;
        double nota1, nota2, media;

        System.out.println("Informe o nome do aluno: ");
        nome = scan.nextLine();

        System.out.println("Informe a primeira nota: ");
        nota1 = scan.nextDouble();

        System.out.println("Informe a segunda nota: ");
        nota2 = scan.nextDouble();

        media = (nota1+nota2)/2;

        if(media>=7){
            System.out.println("O aluno(a) "+nome+" foi aprovado com média "+media);
        }else{
            System.out.println("O aluno(a) "+nome+" foi reprovado com média "+media);
        }
        scan.close();
    }
    
}