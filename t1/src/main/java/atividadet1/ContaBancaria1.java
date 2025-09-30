package atividadet1;
// atividade 9
public class ContaBancaria1 {

    protected String nomeCliente;
    protected String numConta;
    protected double saldo;

// metodo construtor

    public ContaBancaria1 (String nomeCliente, String numConta, double saldoInicial) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldoInicial;
    }

// metodos depositos e saques

    public void depositarSaldo(double valor) {

        if (valor > 0) {
            saldo +=valor;
            String numeroFormatado = String.format("%.2f", valor);
            System.out.println("Depósito de R$ " + numeroFormatado + " realizado com sucesso.");

        }

        else {
            System.out.println("Valor de depósito inválido.");
        
        }
    }

    public void sacarSaldo(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            String numeroFormatado = String.format("%.2f", valor);
            System.out.println("Saque de R$ " + numeroFormatado + " realizado com sucesso.");

        }

        else {
            System.out.println("Valor de saque inválido.");

        }
    }    


// metodos

    public void setNum_conta(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    } 

    public void setTitular(String numConta) {
        this.numConta = numConta;
    }

    public String getNumConta() {
        return numConta;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

}


