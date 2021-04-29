package logica.programacao.aula04;

import java.util.Scanner;

public class Exercicio07 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int numero;
    System.out.println("Digite um número:");
    numero = scan.nextInt();

    if (numero % 2 == 0) {
      System.out.println(
          "O número digita foi " + numero + ", é par, então soma + 5 = " + (numero + 5));
    } else {
      System.out.println(
          "O número digita foi " + numero + ", é ímpar então soma + 8 = " + (numero + 8));
    }

    scan.close();
  }

}
