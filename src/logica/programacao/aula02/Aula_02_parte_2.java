package logica.programacao.aula02;

import java.util.Scanner;

public class Aula_02_parte_2 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String nome;
    int idade;
    System.out.print("Olá aluno(a)! Qual é o seu nome? ");
    nome = scan.next();

    System.out.print(nome + " qual é sua idade? ");
    idade = scan.nextInt();
    System.out.println("Ok " + nome + ", sua idade é " + idade + ".");
    scan.close();
  }
}
