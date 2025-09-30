package atividadet1;
// atividade 11
public class Retangulo implements AreaCalculavel {

    private double base;
    private double altura;

    // metodo construtor

    public Retangulo (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // metodos get e set

    public void setBase (double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    // override

    @Override
    public double calculaArea() {
        return this.base * this.altura;
    }

}
