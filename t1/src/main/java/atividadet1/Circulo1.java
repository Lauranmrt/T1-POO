package atividadet1;
// atividade 11
public class Circulo1 implements AreaCalculavel {
    private double raio;

    // metodo construtor

    public Circulo1 (double raio) {
        this.raio = raio;
    }

    // metodos get e set

    public void setRaio (double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    // override

    @Override
    public double calculaArea() {
        return Math.PI * (this.raio * this.raio);
    }

}
