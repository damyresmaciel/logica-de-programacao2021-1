package logica_de_programacao_aula10;

import java.util.Scanner;

public class Exercicio_05 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int a, b, c;

    System.out.println("Entre com o valor do lado A: ");
    a = scan.nextInt();

    System.out.println("Entre com o valor do lado B: ");
    b = scan.nextInt();

    System.out.println("Entre com o valor do lado C: ");
    c = scan.nextInt();

    if (a == b && b == c) {
      System.out.println("O triangulo é equilátero");
    } else if (a == b && b != c || a != b && a == c || a == b && a != c
        || a != b && b == c) {
      System.out.println("O triangulo é isósceles");
    } else if (a != b && a != c || b != a && b != c || c != a && c != b) {
      System.out.println("O triangulo é escaleno");

    }
    scan.close();
  }

}
