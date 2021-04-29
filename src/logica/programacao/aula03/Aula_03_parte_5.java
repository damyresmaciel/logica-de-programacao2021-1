package logica.programacao.aula03;

import java.util.Scanner;

public class Aula_03_parte_5 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    Double c, f;
    System.out.print("Entre com a temperatura em Celsius: ");
    c = scan.nextDouble();

    f = (c * 9 / 5) + 32;

    System.out.print("A temperatura em Fahrenheit é " + f + "°f");
    scan.close();
  }

}
