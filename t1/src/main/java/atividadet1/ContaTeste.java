package atividadet1;
// atividade 9
public class ContaTeste {

    public static void main(String[] args) {
        System.out.println("------------------------");
        System.out.println("ATIVIDADE 9");  
        ContaPoupanca cp = new ContaPoupanca("Maria", "12345", 1000.0, 15);
        System.out.println("Cliente: " + cp.nomeCliente);
        System.out.println("Número da Conta: " + cp.numConta);
        String saldoInicial1 = String.format("%.2f", cp.saldo);   
        System.out.println("Saldo Inicial: R$ " + saldoInicial1);
        cp.depositarSaldo(500.0);
        cp.sacarSaldo(200.0);
        cp.calcularNovoSaldo(0.05);
        
        System.out.println("------------------------");
        ContaEspecial ce = new ContaEspecial("João", "67890", 1000.0, 500.0);
        System.out.println("Cliente: " + ce.nomeCliente);
        System.out.println("Número da Conta: " + ce.numConta);
        String saldoInicial2 = String.format("%.2f", ce.saldo);        
        System.out.println("Saldo Inicial: R$ " + saldoInicial2);
        ce.sacarSaldo(1200.0);
        ce.sacarSaldo(400.0); 
        System.out.println("------------------------");
    }
}


