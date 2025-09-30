package atividadet1;
// atividade 7
public class FaturaTeste {
    public static void main(String[] args) {
        System.out.println("------------------------");
        System.out.println("ATIVIDADE 7");  
        Fatura f1 = new Fatura("001", "Teclado mecânico", 2, 250.00);
        Fatura f2 = new Fatura("002", "Mouse gamer", -3, -150.00);

        System.out.println("Fatura 1:");
        String numeroFormatado1 = String.format("%.2f", f1.getPreco());
        String numeroFormatado2 = String.format("%.2f", f1.getTotalFatura());
        System.out.println("Número: " + f1.getNumero());
        System.out.println("Descrição: " + f1.getDescricao());
        System.out.println("Quantidade: " + f1.getQuantidade());
        System.out.println("Preço por item: R$ " + numeroFormatado1);
        System.out.println("Total da fatura: R$ " + numeroFormatado2);
        System.out.println("------------------------");

        System.out.println("Fatura 2:");
        String numeroFormatado3 = String.format("%.2f", f2.getPreco());
        String numeroFormatado4 = String.format("%.2f", f2.getTotalFatura());
        System.out.println("Número: " + f2.getNumero());
        System.out.println("Descrição: " + f2.getDescricao());
        System.out.println("Quantidade: " + f2.getQuantidade());
        System.out.println("Preço por item: R$ " + numeroFormatado3);
        System.out.println("Total da fatura: R$ " + numeroFormatado4);
        System.out.println("------------------------");
    }
}