package atividadet1;

public class Main {
    public static void main(String[] args) {

        // atividade 1
        System.out.println("------------------------");
        System.out.println("ATIVIDADE 1");
        Pessoa pessoa1 = new Pessoa("Laura", 19, "Auxiliar Administrativo");
        pessoa1.Exibir();
        System.out.println("------------------------");

        // atividade 2
        System.out.println("ATIVIDADE 2");
        Circulo circulo1 = new Circulo(4);
        System.out.println("Raio: " + circulo1.getRaio());
        System.out.println("Área: " + circulo1.calcularArea());
        System.out.println("Perímetro: " + circulo1.calcularPerimetro());
        System.out.println("------------------------");

        // atividade 3
        System.out.println("ATIVIDADE 3");
        ContaBancaria contaBancaria1 = new ContaBancaria("21354545", "Laura Elisa B. B.", 20);
        System.out.println("Número da Conta: " + contaBancaria1.getNum_conta());
        System.out.println("Titular: " + contaBancaria1.getTitular());
        String numeroFormatado = String.format("%.2f", contaBancaria1.getSaldo());
        System.out.println("Saldo: R$ " + numeroFormatado);
        contaBancaria1.depositoSaldo(100);
        contaBancaria1.sacarSaldo(10);
        System.out.println("------------------------");

        // atividade 4
        System.out.println("ATIVIDADE 4");
        Triangulo triangulo1 = new Triangulo(5, 4, 3);
        System.out.println("Lado 1: " + triangulo1.getLado1());
        System.out.println("Lado 2: " + triangulo1.getLado2());
        System.out.println("Lado 3: " + triangulo1.getLado3());
        System.out.println("Área: " + triangulo1.calcularAreaTriangulo());
        System.out.println("------------------------");

        // atividade 5
        System.out.println("ATIVIDADE 5");
        Calculadora calc = new Calculadora();
        calc.adicionarNumero(100); calc.adicionarNumero(10); calc.adicionarNumero(5); calc.adicionarNumero(2);
        calc.mostrarNumeros();
        System.out.println("A adição dos componentes da lista resulta em: " + calc.somar());
        System.out.println("A subtração dos componentes da lista resulta em: " + calc.subtrair());
        System.out.println("A multiplicação dos componentes da lista resulta em: " + calc.multiplicar());
        System.out.println("A divisão dos componentes da lista resulta em: " + calc.dividir());
        System.out.println("------------------------");

        // atividade 6
        System.out.println("ATIVIDADE 6");
        Carro carro1 = new Carro("OTM 2X22", 0);
        Pessoa1 p = new Pessoa1("Laura", carro1);
        p.ligarCarro();
        p.trocarMarcha(1);
        p.acelerarCarro();
        p.trocarMarcha(2);
        p.frearCarro();
        p.desligarCarro();
        System.out.println("------------------------");

        // atividade 11
        System.out.println("ATIVIDADE 11");
        Retangulo r1 = new Retangulo(4, 6);
        Quadrado q1 = new Quadrado(8);
        Circulo1 c1 = new Circulo1(4);
        System.out.println("--- RETÂNGULO ---");
        System.out.println("Base: " + r1.getBase());
        System.out.println("Altura: " + r1.getAltura());
        System.out.println("Área do Retângulo: " + r1.calculaArea());
        System.out.println("--- QUADRADO ---");
        System.out.println("Lado: " + q1.getLado());
        System.out.println("Área do Quadrado: " + q1.calculaArea());
        System.out.println("--- CÍRCULO ---");
        System.out.println("Raio: " + c1.getRaio());
        System.out.println("Área do Círculo: " + c1.calculaArea());
        System.out.println("------------------------");
    }
}