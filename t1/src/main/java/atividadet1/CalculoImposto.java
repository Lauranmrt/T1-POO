package atividadet1;
// atividade 10
public class CalculoImposto {
        public static void main(String[] args) {
            PessoaFisica pf1 = new PessoaFisica("Laura Elisa", 3000);
            PessoaFisica pf2 = new PessoaFisica("Gabriel", 6000);
            PessoaFisica pf3 = new PessoaFisica("Eduarda", 1800);
            PessoaJuridica pj1 = new PessoaJuridica("BAZA Agronegocios", 1000000);
            PessoaJuridica pj2 = new PessoaJuridica("Vale do Verde", 2000000);
            PessoaJuridica pj3 = new PessoaJuridica("Verde Agrícola", 2500000);

            String pf1renda = String.format("%.2f", pf1.getRendaBruta());
            String pf2renda = String.format("%.2f", pf2.getRendaBruta());
            String pf3renda = String.format("%.2f", pf3.getRendaBruta());
            String pj1renda = String.format("%.2f", pj1.getRendaBruta());
            String pj2renda = String.format("%.2f", pj2.getRendaBruta());
            String pj3renda = String.format("%.2f", pj3.getRendaBruta());

            String pf1imposto = String.format("%.2f", pf1.calcularImposto());
            String pf2imposto = String.format("%.2f", pf2.calcularImposto());
            String pf3imposto = String.format("%.2f", pf3.calcularImposto());
            String pj1imposto = String.format("%.2f", pj1.calcularImposto());
            String pj2imposto = String.format("%.2f", pj2.calcularImposto());
            String pj3imposto = String.format("%.2f", pj3.calcularImposto());

            System.out.println("------------------------");
            System.out.println("ATIVIDADE 10");
            System.out.println("--- PESSOA FÍSICA 1 ---");
            System.out.println("Nome: " + pf1.getNome());
            System.out.println("Renda Bruta: R$ " + pf1renda);
            System.out.println("Impostos gerados: R$ " + pf1imposto);
            System.out.println("--- PESSOA FÍSICA 2 ---");
            System.out.println("Nome: " + pf2.getNome());
            System.out.println("Renda Bruta: R$ " + pf2renda);
            System.out.println("Impostos gerados: R$ " + pf2imposto);
            System.out.println("--- PESSOA FÍSICA 3 ---");
            System.out.println("Nome: " + pf3.getNome());
            System.out.println("Renda Bruta: R$ " + pf3renda);
            System.out.println("Impostos gerados: R$ " + pf3imposto);
            System.out.println("--- PESSOA JURÍDICA 1 ---");
            System.out.println("Nome: " + pj1.getNome());
            System.out.println("Renda Bruta: R$ " + pj1renda);
            System.out.println("Impostos gerados: R$ " + pj1imposto);
            System.out.println("--- PESSOA JURÍDICA 2 ---");
            System.out.println("Nome: " + pj2.getNome());
            System.out.println("Renda Bruta: R$ " + pj2renda);
            System.out.println("Impostos gerados: R$ " + pj2imposto);
            System.out.println("--- PESSOA JURÍDICA 3 ---");
            System.out.println("Nome: " + pj3.getNome());
            System.out.println("Renda Bruta: R$ " + pj3renda);
            System.out.println("Impostos gerados: R$ " + pj3imposto);
            System.out.println("------------------------");
        }
}
