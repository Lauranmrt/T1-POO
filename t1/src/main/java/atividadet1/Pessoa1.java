package atividadet1;

// atividade 6

public class Pessoa1 {

    private String nome;
    private Carro meuCarro;


// metodo construtor

public Pessoa1(String nome, Carro meuCarro) {
    this.nome = nome;
    this.meuCarro = meuCarro;
}

// metodos solicitados

public void ligarCarro() {
    System.out.println(this.nome + " está tentando ligar o carro.");
    this.meuCarro.ligarCarro();
}

public void trocarMarcha(int novaMarcha) {
    System.out.println(this.nome + " está trocando a marcha para " + novaMarcha);
    this.meuCarro.trocarMarcha(novaMarcha);

}

public void acelerarCarro() {
    System.out.println(this.nome + " está acelerando o carro.");
    this.meuCarro.acelerarCarro();

}

public void frearCarro() {
    System.out.println(this.nome + " está freando o carro.");
    this.meuCarro.frearCarro();

}

public void desligarCarro() {
    System.out.println(this.nome + " está tentando desligar o carro.");
    this.meuCarro.desligarCarro();

}

}


