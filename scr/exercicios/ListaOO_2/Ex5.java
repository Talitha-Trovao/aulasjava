package ListaOO_2;

public class Ex5 {
    public class Ingresso {
        private double valor;
    
        public Ingresso(double valor) {
            this.valor = valor;
        }
    
        public double getValor() {
            return valor;
        }
    
        public void setValor(double valor) {
            this.valor = valor;
        }
    
        @Override
        public String toString() {
            return ("O ingresso custa" + valor );
        }
    }
    
    
    
}