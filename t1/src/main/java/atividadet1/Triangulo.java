package atividadet1;

// atividade 4

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    // metodo construtor

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;

    }

    // metodo para verificar se é um triangulo valido

    public boolean trianguloValido() {

        return (lado1 > 0 && lado2 > 0 && lado3 > 0) && (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }

    // metodo para calcular a area

    public double calcularAreaTriangulo() {

        if (!trianguloValido()) {
            System.out.println("Os lados fornecidos não formam um triângulo válido");
            return 0;
        }

        double s = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        return area;

    }

    // metodos

    public void setLado1(double lado1) {
        this.lado1 = lado1;

    }

    public double getLado1() {
        return lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;

    }

    public double getLado2() {
        return lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;

    }

    public double getLado3() {
        return lado3;
    }
}
