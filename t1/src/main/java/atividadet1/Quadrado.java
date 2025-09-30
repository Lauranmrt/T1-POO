package atividadet1;
// atividade 11
public class Quadrado implements AreaCalculavel {
    
    private double lado;

    // metodo construtor
    public Quadrado(double lado) {
        this.lado = lado;
    }

    // metodos get e set

    public void setLado (double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    // override
    @Override
    public double calculaArea() {
        return this.lado * this.lado;
    }
}
