package logica.programacao.aula04;

import java.util.Scanner;

public class Exercicio09 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String sexo;
    double altura, pesoIdeal;

    System.out.println("Digite a altura: ");
    altura = scan.nextDouble();

    System.out.println("Digte o sexo: ");
    sexo = scan.next();

    if (sexo.equalsIgnoreCase("M")) {
      pesoIdeal = (72.7 * altura) - 58;
      System.out.println(pesoIdeal);
    }
    if (sexo.equalsIgnoreCase("F")) {
      pesoIdeal = (62.1 * altura) - 44.7;
      System.out.println(pesoIdeal);
    }
    scan.close();
  }

}
