package logica.programacao.aula04;

import java.util.Scanner;

public class Exercicio01 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    double a, b, c, soma;
    System.out.println("Valor de A: ");
    a = scan.nextDouble();

    System.out.println("Valor de B: ");
    b = scan.nextDouble();

    System.out.println("Valor de C: ");
    c = scan.nextDouble();

    soma = a + b;
    if (soma < c) {
      System.out.println("A soma de A + B é menor que C.");
    }
    if (soma > c) {
      System.out.println("A soma de A + B é maior que C.");
    }
    scan.close();
  }
}
