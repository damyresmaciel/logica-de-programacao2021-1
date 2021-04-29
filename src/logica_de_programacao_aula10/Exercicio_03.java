package logica_de_programacao_aula10;

import java.util.Scanner;

public class Exercicio_03 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int numero = 1000;
    while (numero >= 1000 && numero <= 1999) {
      if (numero % 11 == 5) {
        System.out.println(numero);
      }
      numero++;
    }
    scan.close();
  }

}
