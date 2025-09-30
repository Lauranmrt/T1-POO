package atividadet1;
// atividade 10
public abstract class Contribuinte {
    protected String nome;
    protected double rendaBruta;


    // metodo construtor

    public Contribuinte(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }
    // metodos get e set, se necessários

    public String getNome() {
        return nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    // metodo calculo

    public abstract double calcularImposto();
}
