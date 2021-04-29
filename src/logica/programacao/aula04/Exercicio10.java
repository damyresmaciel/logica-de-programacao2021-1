package logica.programacao.aula04;

import java.util.Scanner;

public class Exercicio10 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    double peso, altura, imc;

    System.out.println("Digite o peso:");
    peso = scan.nextDouble();

    System.out.println("Digite a altura:");
    altura = scan.nextDouble();

    imc = peso / (altura * altura);

    System.out.println("Seu imc é " + imc);
    if (imc < 18.5) {
      System.out.println("Abaixo do peso.");
    } else if (imc > 18.5 && imc < 25) {
      System.out.println("Peso normal.");
    } else if (imc > 25 && imc < 30) {
      System.out.println("Acima do peso.");
    } else {
      System.out.println("Obeso.");
    }
    scan.close();

  }

}
