package ClasseAbstrata;

public class Concretoveiculo {
    public static void main(String[] args) {
        Automovel automovel = new Automovel();
        Aviao aviao = new Aviao();

//alterando status do automovel
        System.out.println("automovel atatus: "+ automovel.isStatus());
        automovel.ligar();
        System.out.println("automovel atatus: "+ automovel.isStatus());

//acelerando automovel
        System.out.println("automovel velocidade: "+ automovel.getVel());
        automovel.acelerar();
        System.out.println("automovel velocidade: "+ automovel.getVel());

//acelerando aviao
        System.out.println("aviao velocidade: "+ aviao.getVel());
        aviao.acelerar();
        aviao.acelerar();
        aviao.acelerar();
        System.out.println("aviao velocidade: "+ aviao.getVel());

    }
    
}