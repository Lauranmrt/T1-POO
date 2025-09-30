package atividadet1;
// atividade 8
public class EmpregadoTeste {
    public static void main(String[] args) {
        System.out.println("------------------------");
        System.out.println("ATIVIDADE 8");  
        Empregado e1 = new Empregado("Laura", "Bordinhon", 3000);
        Empregado e2 = new Empregado("Lucas", "Bordinhon", 6000);

        System.out.println("Empregado 1:");
        String salario_mensal = String.format("%.2f", e1.getSalario());
        String salario_anual = String.format("%.2f", e1.getSalario() * 12);
        String aumento_anual = String.format("%.2f", ((e1.getSalario() * 10/100) + e1.getSalario()) * 12);
        System.out.println("Nome: " + e1.getNome());
        System.out.println("Sobrenome: " + e1.getSobrenome());
        System.out.println("Salário Mensal: R$ " + salario_mensal);
        System.out.println("Salário Anual: R$ " + salario_anual);
        System.out.println("Salário Anual com 10% de Aumento: R$ " + aumento_anual);
        System.out.println("------------------------");

        System.out.println("Empregado 2:");
        String salario_mensal2 = String.format("%.2f", e2.getSalario());
        String salario_anual2 = String.format("%.2f", e2.getSalario() * 12);
        String aumento_anual2 = String.format("%.2f", ((e2.getSalario() * 10/100) + e2.getSalario()) * 12);
        System.out.println("Nome: " + e2.getNome());
        System.out.println("Sobrenome: " + e2.getSobrenome());
        System.out.println("Salário Mensal: R$ " + salario_mensal2);
        System.out.println("Salário Anual: R$ " + salario_anual2);
        System.out.println("Salário Anual com 10% de Aumento: R$ " + aumento_anual2);
        System.out.println("------------------------");
    }
}
