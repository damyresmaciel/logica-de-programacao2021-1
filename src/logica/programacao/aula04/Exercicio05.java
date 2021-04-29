package logica.programacao.aula04;

import java.util.Scanner;

public class Exercicio05 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    double numero;
    

    System.out.println("Digite um número: ");
    numero = scan.nextInt();

    if (numero > 0) {
      System.out.println(numero*2);
    } else if (numero < 0) {
      System.out.println(numero*3);
    }
    scan.close();
  }
}
