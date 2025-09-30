package atividadet1;
// atividade 12
public class ContaCorrente extends Conta implements Tributavel {

    // metodo construtor

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    // override
    @Override
    public double calculaTributos() {
        return this.obterSaldo() * 0.01;
    }
}
