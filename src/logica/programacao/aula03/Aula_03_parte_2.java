package logica.programacao.aula03;

import java.util.Scanner;

public class Aula_03_parte_2 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int anoAtual, anoNascimento, idade;

    System.out.print("Entre com o ano atual: ");
    anoAtual = scan.nextInt();
    System.out.print("Entre com ano de nascimento: ");
    anoNascimento = scan.nextInt();
    if (anoNascimento > anoAtual) {
      System.out.println("Data inválida!");
    } else {
      idade = anoAtual - anoNascimento;
      System.out.println("Sua idade é " + idade + " anos.");
    }
    scan.close();
  }
}
