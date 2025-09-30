package atividadet1;
// atividade 10
public class PessoaJuridica extends Contribuinte {

    // metodo construtor
    public PessoaJuridica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }

    // calculo

    @Override
    public double calcularImposto() {
        return rendaBruta * 0.10;
    }
}
