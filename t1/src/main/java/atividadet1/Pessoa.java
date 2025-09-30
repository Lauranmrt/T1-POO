package atividadet1;

// atividade 1

public class Pessoa {

    private String nome;
    private int idade;
    private String profissao;

// metodo construtor

    public Pessoa (String nome, int idade, String profissao){
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

// calculo anos bissextos - atividade 1

    public int quantosAnosBissextos() {
        return idade / 4;

    }

// Exibir - atividade 1

    public void Exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Profissão: " + profissao);
        System.out.println("Anos bissextos: " + quantosAnosBissextos());
    }

// metodos

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade (int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getProfissao() {
        return profissao;
    }
}


// colocar o print do resultado do que estiver no terminal sendo exibido no pdf da atividade, e colocar no github

