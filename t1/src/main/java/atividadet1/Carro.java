package atividadet1;

public class Carro {
    private String placa;
    private int marcha;


// metodo construtor

    public Carro (String placa, int marcha) {
        this.placa = placa;
        this.marcha = 0;
    }

// metodos solicitados

    public void ligarCarro() {
        System.out.println("Ligado...");
    }

    public void trocarMarcha(int marcha) {
        this.marcha = marcha;
        System.out.println("Marcha trocada...");
    }

    public void acelerarCarro() {
        System.out.println("Acelerou...");
    }

    public void frearCarro() {
        System.out.println("Freiou...");
    }

    public void desligarCarro() {
        System.out.println("Desligou...");
    }

// metodos

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public int getMarcha() {
        return marcha + 1;
    }
}
