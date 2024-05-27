package com.marianasena.entities;

public class stderr {

        public static void main(String[] args) {
            try {
                int resultado = dividir(10, 2);
                System.out.println("Resultado da divisão: " + resultado);
            } catch (ArithmeticException e) {
                System.err.println("Erro: divisão por zero!");
                e.printStackTrace(); // Exibir mais informações sobre a exceção
            }
        }

        public static int dividir(int dividendo, int divisor) {
            return dividendo / divisor;
        }
}
