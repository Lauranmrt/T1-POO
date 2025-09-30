package atividadet1;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    private List<Double> numeros;

// metodo construtor

    public Calculadora() {
        this.numeros = new ArrayList<>();
    }

// metodos para adicionar, limpar, mostrar numeros

    public void adicionarNumero(double numero) {
        this.numeros.add(numero);
    }

    public void limparNumeros() {
        this.numeros.clear();
        System.out.println("Calculadora resetada.");
    }

    public void mostrarNumeros() {

        if (numeros.isEmpty()) {
            System.out.println("A lista de números está vazia.");
            return;
        }
        System.out.println("Números na calculadora: " + this.numeros);
    }


// metodos para calcular   

    public double somar() {
        double resultado = 0.0;
        for (double numero : this.numeros) {
            resultado +=numero;
        }
        return resultado;
    }

    public double subtrair() {
        if (numeros.isEmpty()) {
            return 0;
        }

        double resultado = this.numeros.get(0);
        for (int i = 1; i < this.numeros.size(); i++) {
            resultado -= this.numeros.get(i);
        }

        return resultado;
    }

    public double multiplicar() {
        if (numeros.isEmpty()) {
            return 1;
        }

        double resultado = 1.0;
        for (double numero : this.numeros) {
            resultado *= numero;
        }
        return resultado;

    }

    public double dividir() {
        if (numeros.isEmpty()) {
            return 0;
        }

        double resultado = this.numeros.get(0);

        for (int i = 1; i < this.numeros.size(); i++) {
            double divisor = this.numeros.get(i);
            if (divisor == 0) {
                throw new IllegalArgumentException("Erro: Tentativa de divisão por zero.");
            }

            resultado /= divisor;
        }

        return resultado;
    }
}
