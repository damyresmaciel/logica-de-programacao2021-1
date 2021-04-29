package logica.programacao.aula04;

import java.util.Scanner;

public class Exercicio04 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int a, b, c;
    System.out.println("Valor de A: ");
    a = scan.nextInt();
    System.out.println("Valor de B: ");
    b = scan.nextInt();

    if (a == b) {
      c = a + b;
      System.out.println("C = " + c);
    } else if (a != b) {
      c = a * b;
      System.out.println("C = " + c);
    }
    scan.close();
  }

}
