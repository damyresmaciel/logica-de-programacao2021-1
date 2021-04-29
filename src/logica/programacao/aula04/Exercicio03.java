package logica.programacao.aula04;

import java.util.Scanner;

public class Exercicio03 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int numero;
    System.out.println("Digite um número: ");
    numero = scan.nextInt();

    if (numero % 2 == 0) {
      System.out.println("Par");
    } else {
      System.out.println("Impar");
    }
    scan.close();
  }

}
