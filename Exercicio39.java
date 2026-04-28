package com.mycompany.exercicio39;

import javax.swing.JOptionPane;

public class Exercicio39 {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2:"));
        int n = 0;

        try {
            n = n1 / n2;
            System.out.println("O resultado é: " + n);
        } catch (ArithmeticException e) {
            System.out.println("O número 2 não pode ser 0!");
        }
    }
}
