package ListaOO_2;

//uma classe dentro da outra para manter a organização dos nomes dos exercicios

public class Ex5_2 extends Ex5{
    public class IngressoVIP extends Ingresso {
        private double valorAdicional;
    
        public IngressoVIP(double valor, double valorAdicional) {
            super(valor);
            this.valorAdicional = valorAdicional;
        }
    
        public double getValorAdicional() {
            return valorAdicional;
        }
    
        public void setValorAdicional(double valorAdicional) {
            this.valorAdicional = valorAdicional;
        }
    
        @Override
        public String toString() {
            return ("O Ingresso vip custa " + (super.getValor() + valorAdicional));
        }
    }
    
}