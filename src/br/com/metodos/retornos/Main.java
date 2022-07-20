package br.com.metodos.retornos;

import br.com.metodos.sobrecarga.Quadrilatero;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercício Retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Área do Retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Área do Trapézio: " + areaTrapézio);

    }
}
