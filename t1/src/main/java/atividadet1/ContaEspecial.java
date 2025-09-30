package atividadet1;
// atividade 9
public class ContaEspecial extends ContaBancaria1 {
    private double limite;

    public ContaEspecial(String nomeCliente, String numConta, double saldoInicial, double limite) {
        super(nomeCliente, numConta, saldoInicial);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacarSaldo(double valor) {
        if (valor > 0 && valor <= (getSaldo() + limite)) {
            setSaldo(getSaldo() - valor);
            String numeroFormatado = String.format("%.2f", valor);
            System.out.println("Saque de R$ " + numeroFormatado + " realizado com sucesso.");} 
        else {
            System.out.println("Valor de saque inválido. Saldo insuficiente mesmo com limite.");}
}
}
