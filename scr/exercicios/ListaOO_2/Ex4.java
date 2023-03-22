// Escreva uma classe que represente um país. Um país é representado através dos
// atributos: código ISO 3166-1 (ex.: BRA), nome (ex.: Brasil), população (ex.:
// 193.946.886) e a sua dimensão em Km2 (ex.: 8.515.767,049). Além disso, cada país
// mantém uma lista de outros países com os quais ele faz fronteira. Escreva a classe em
// Java e forneça os seus membros a seguir:
// a) Construtor que inicialize o código ISO, o nome e a dimensão do país;
// b) Métodos de acesso (getter/setter) para as propriedades código ISSO, nome,
// população e dimensão do país;
// c) Um método que permita verificar se dois objetos representam o mesmo país
// (igualdade semântica). Dois países são iguais se tiverem o mesmo código ISO;
// d) Um método que informe se outro país é limítrofe do país que recebeu a mensagem;
// e) Um método que retorne a densidade populacional do país;
// f) Um método que receba um país como parâmetro e retorne a lista de vizinhos comuns
// aos dois países.
// Considere que um país tem no máximo 40 outros países com os quais ele faz fronteira

package ListaOO_2;

import java.util.ArrayList;
import java.util.List;

public class pais {
    private String ISO;
    private String nomepais;
    private double populacao; //long
    private double dimensao; 
    private List<String> comfronteira =  new ArrayList<>();

    public pais(String ISO, String nomepais, double dimensao){
        this.ISO = ISO;
        this.nomepais = nomepais;
        this.dimensao = dimensao;
    }

    public void getISO(){
        return ISO;
    }
    public void setISO(String ISO){
        this.ISO = ISO;
    }

    public void getnomepais(){
        return nomepais;
    }
    public void setnomepais(String nomepais){
        this.nomepais = nomepais;
    }

    public int getpopulacao(){
        return populacao;
    }
    public int setpopulacao(Double populacao){
        this.populacao = populacao;
    }
    public int getdimensao(){
        return dimensao;
    }
    public int setdimensao(Double dimensao){
        this.dimensao = dimensao;
    }


    
}