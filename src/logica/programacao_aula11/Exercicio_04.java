package logica.programacao_aula11;

import java.util.Scanner;

public class Exercicio_04 {

  public static void main(String[] args) {

    System.out.println(recebePalavra());

  }

  public static StringBuffer recebePalavra() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Entre com a palvra: ");
    return new StringBuffer(scan.next()).reverse();
  }
}
