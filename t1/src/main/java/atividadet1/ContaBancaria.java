package atividadet1;

// atividade 3

public class ContaBancaria {

    private String num_conta;
    private String titular;
    private double saldo;

// metodo construtor

    public ContaBancaria(String num_conta, String titular, double saldoInicial) {
        this.num_conta = num_conta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

// metodos depositos e saques

    public void depositoSaldo(double valor) {

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

    public void setNum_conta(String num_conta) {
        this.num_conta = num_conta;
    }

    public String getNum_conta() {
        return num_conta;
    } 

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

}

