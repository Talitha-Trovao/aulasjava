package Orientacaoobjetos.OO_Ex1;
// aqui se define as classes e atributos. não há retorno para o usuário.
public class Carro {
    //dados de estado da classe carro
    String modelo;
    String fabricante;
    String cor;
    int nportas;
    int potencia;
    double vmax;
    int nmarchas;
    boolean comarcondicionado;
    boolean ligado = false;

    //definição de metodos do que o carro faz
    public void liga(boolean ligado){
        if(ligado == false){
            this.ligado = true; //o this. acessa o atributo fora do metodo
        }

    }
    public void desliga(boolean){
        if(ligado == true){
            
        }
    }

    




    
}
