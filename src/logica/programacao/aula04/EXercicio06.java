package logica.programacao.aula04;

import java.util.Scanner;

public class EXercicio06 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int valor;
    System.out.println("Entre um valor: ");
    valor = scan.nextInt();

    if (valor<0) {
      System.out.println("false");
    } else {
      System.out.println("true");
    }
    scan.close();
  }

}
