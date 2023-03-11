// Descreva em no máximo 200 palavras o que é um automóvel e o que
// ele faz. Liste os substantivos e verbos separadamente. Cada substantivo corresponde
// a um objeto que precisará ser construído para implementar um sistema, nesse caso, um carro. 
//Selecione 5 dos objetos que você listou e, para cada um, liste vários
// atributos e comportamentos. Descreva brevemente como esses objetos interagem
// entre si e com outros objetos na sua descrição. Estes passos que você seguiu são
// típicos do projeto orientado a objetos


package Orientacaoobjetos.OO_Ex1;
// aqui se define as classes e atributos. não há retorno para o usuário.
public class Carro_atributos {
    //dados de estado da classe carro
    String modelo;
    String fabricante;
    String cor;
    int nportas;
    int potencia;
    double vmax;
    int nmarchas;
    boolean comarcondicionado;
    boolean ligado;
    boolean piscaalerta;
    boolean setadireita;
    boolean setaesquerda;

    //definição de metodos do que o carro faz

    //ligar carro
    public void liga(boolean ligado){
        if(ligado == false){
            this.ligado = true; //o this. acessa o atributo fora do metodo
            System.out.println("O carro está ligado.");
        }
    }
    //desligar carro
    public void desliga(boolean ligado){
        if(ligado == true){
            this.ligado = false;
            System.out.println("o carro está desligado.");
        }}
    

    //desligar ar condicionado
    public void arcondicionado_off(boolean comarcondicionado){
        if(comarcondicionado == true){
            this.comarcondicionado = false;
        }
    }

    //ligar ar condicionado
    public void arcondicionado_on(boolean comarcondicionado){
        if(comarcondicionado == false){
            this.comarcondicionado = true;
        }
    }

    //ligar pisca alerta
    public void ligaralerta(boolean piscaalerta){
        if(piscaalerta == false){
            this.piscaalerta = true;
        }
    }

}




    

