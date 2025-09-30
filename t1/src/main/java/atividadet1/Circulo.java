package atividadet1;

// atividade 2

public class Circulo {

    private double raio;

// metodo construtor

    public Circulo(double raio) {
        this.raio = raio;
    }

// metodos para calcular area e perimetro

    public double calcularPerimetro() {
        return raio * 2 * Math.PI;
    }


    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

// metodos

public void setRaio(double raio) {

    this.raio = raio;
}

public double getRaio() {

    return raio;
} 


}


// colocar o print do resultado do que estiver no terminal sendo exibido no pdf da ativi-
// dade, e colocar no github

