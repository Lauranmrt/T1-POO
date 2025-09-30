package atividadet1;
// atividade 9
public class ContaPoupanca extends ContaBancaria1 {
    private int diaRendimento;

    public ContaPoupanca (String nomeCliente, String numConta, double saldoInicial, int diaRendimento) {
        super(nomeCliente, numConta, saldoInicial);
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(double taxaRendimento) {
        double rendimento = getSaldo() * taxaRendimento;
        setSaldo(getSaldo() + rendimento);
        System.out.println("Saldo atualizado com rendimetno de " + (taxaRendimento * 100) + 
                            "%: R$ " + String.format("%.2f", getSaldo())); 
    }


}
