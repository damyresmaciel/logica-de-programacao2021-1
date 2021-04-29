package logica.programacao.aula04;

import java.util.Scanner;

public class Exercicio02 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String nome, sexo, estadoCivil;
    int qtdCasamento;

    System.out.print("Digite o nome: ");
    nome = scan.next();
    System.out.print("Digite o sexo: ");
    sexo = scan.next();
    System.out.print("Digite o estado civil: ");
    estadoCivil = scan.next();

    if (sexo.equalsIgnoreCase("f") && estadoCivil.equalsIgnoreCase("casada")) {
      System.out.println("Quantos anos de casada? ");
      qtdCasamento = scan.nextInt();
      System.out
          .println("Nome: " + nome + ", Sexo: " + sexo.toUpperCase() + " , Estado Civil: "
              + estadoCivil.toUpperCase() + ", Casada á " + qtdCasamento + " anos.");
    }
    if (sexo.equalsIgnoreCase("m") && estadoCivil.equalsIgnoreCase("casado")) {
      System.out.println("Quantos anos de casado? ");
      qtdCasamento = scan.nextInt();
      System.out
          .println("Nome: " + nome + ", Sexo: " + sexo.toUpperCase() + ", Estado Civil: "
              + estadoCivil.toUpperCase() + ", Casado á " + qtdCasamento + " anos.");
    }
    if (!estadoCivil.equalsIgnoreCase("casada")
        && !estadoCivil.equalsIgnoreCase("casado")) {
      System.out.println("Nome: " + nome + ", Sexo: " + sexo.toUpperCase()
          + ", Estado Civil: " + estadoCivil.toUpperCase() + ".");
    }
    scan.close();
  }
}
