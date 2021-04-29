package logica.programacao.aula03;

import java.util.Scanner;

public class Aula_03_parte_7 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int anoNasc, anoAtual, idade;
    System.out.print("Qual o ano de nascimento? ");
    anoNasc = scan.nextInt();

    System.out.print("Qual o ano atual? ");
    anoAtual = scan.nextInt();

    idade = anoAtual - anoNasc;

    System.out.print("Sua idade é " + idade + " anos.");
    scan.close();
  }

}
