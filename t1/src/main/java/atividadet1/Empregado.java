package atividadet1;
// atividade 8
public class Empregado {
    private String nome;
    private String sobrenome;
    private double salario_mensal;

    // metodo construtor

    public Empregado (String nome, String sobrenome, double salario_mensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario_mensal = salario_mensal;
    }

    // metodos

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSalario(double salario_mensal) {
        this.salario_mensal = salario_mensal;
    }

    public double getSalario() {
        return salario_mensal;
    }
}
