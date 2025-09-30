package atividadet1;

// atividade 7

public class Fatura {
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;


// metodo construtor

    public Fatura(String numero, String descricao, int quantidade, double preco) {
        setNumero(numero);
        setDescricao(descricao);
        setQuantidade(quantidade);
        setPreco(preco);
    }

// metodo calculo

    public double getTotalFatura() {
        return quantidade * preco;
    }

// metodos

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {this.quantidade = quantidade;}
        else {this.quantidade = 0;}
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setPreco(double preco) {
        if (preco > 0) {this.preco = preco;}
        else {this.preco = 0.0;}

    }

    public double getPreco() {
        return preco;
    }
}
