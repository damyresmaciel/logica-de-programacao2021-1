package logica.programacao.aula02;

import java.util.Scanner;

public class Aula_02_parte_1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double num1 = 0, num2 = 0;
    String nome;
    System.out.print("Digite seu nome: ");
    nome = scan.next();

    System.out.print(nome + " entre com o primeiro número: ");
    num1 = scan.nextDouble();

    System.out.print(nome + " entre com o segundo número: ");
    num2 = scan.nextDouble();

    if (num1 > num2) {
      System.out.print(nome + ", o maior número é " + num1);
    } else if (num2 > num1) {
      System.out.println(nome + " o maior número é " + num2);
    } else {
      System.out.println(nome + " os números são iguais.");
    }
    if (num1 % 2 != 0 || num2 % 2 != 0) {
      System.out.println("O número é impar");
    }
    scan.close();
  }
}
