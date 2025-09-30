package atividadet1;
// atividade 12
public class TestaTributavel {
 public static void main(String[] args) {
        System.out.println("------------------------");
        System.out.println("ATIVIDADE 12");

        ContaCorrente cc1 = new ContaCorrente(1000.00);
        SeguroDeVida sv1 = new SeguroDeVida();
        ContaPoupanca1 cp1 = new ContaPoupanca1(5000.00);

        System.out.println("--- Conta Corrente ---");
        System.out.printf("Saldo inicial da Conta Corrente: R$ %.2f\n", cc1.obterSaldo());
        double tributoCC = cc1.calculaTributos();
        double tributoSV = sv1.calculaTributos();
        System.out.printf("Tributo da Conta Corrente (1%%): R$ %.2f\n", tributoCC);
        System.out.printf("Tributo do Seguro de Vida (taxa fixa): R$ %.2f\n", tributoSV);
        
        System.out.println("--- Totais de Tributos da CC ---");
        Tributavel t1 = cc1;
        Tributavel t2 = sv1;
        double totalTributos = t1.calculaTributos() + t2.calculaTributos();
        System.out.printf("Total de tributos a serem pagos: R$ %.2f\n", totalTributos);

        System.out.println("--- Conta Poupança ---");
        System.out.printf("Saldo inicial da Conta Poupança: R$ %.2f\n", cp1.obterSaldo());
        cp1.depositar(200);
        System.out.println("------------------------");
    }
}
