package atividadet1;
// atividade 10
public class PessoaFisica extends Contribuinte {
    
    // metodo construtor

    public PessoaFisica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }

    // calculo
    
    @Override
    public double calcularImposto() {
        if (rendaBruta <= 1400.00) {return 0.0;}
        else if (rendaBruta <= 2100.00) {return (rendaBruta * 0.10) - 100.00;}
        else if (rendaBruta <= 2800.00) {return (rendaBruta * 0.15) - 270.00;}
        else if (rendaBruta <= 3600.00) {return (rendaBruta * 0.25) - 500.00;}
        else {return (rendaBruta * 0.30) - 700.00;}
    }
}
