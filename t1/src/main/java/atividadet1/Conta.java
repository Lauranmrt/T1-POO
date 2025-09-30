package atividadet1;
// atividade 12
public abstract class Conta {

    protected double saldo;

    // construtor
    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    
    // get e set

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    
    // metodos solicitados
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            String numeroFormatado = String.format("%.2f", valor);
            System.out.println("Depósito de R$ " + numeroFormatado + " realizado com sucesso.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            String numeroFormatado = String.format("%.2f", valor);
            System.out.println("Saque de R$" + numeroFormatado + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

    public double obterSaldo() {
        return getSaldo();
    }
}
