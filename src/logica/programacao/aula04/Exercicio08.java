package logica.programacao.aula04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio08 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int numero;

    List<Integer> numeros = new ArrayList<Integer>();
    for (int i = 0; i < 3; i++) {
      System.out.print("Digite o número " + (i + 1) + ": ");
      numero = scan.nextInt();
      numeros.add(numero);
    }

    Collections.sort(numeros, Collections.reverseOrder());

    System.out.println(numeros);
    scan.close();
  }

}
