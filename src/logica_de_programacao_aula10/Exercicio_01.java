package logica_de_programacao_aula10;

import java.util.Scanner;

public class Exercicio_01 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String operador;
    double n1, n2;
    System.out.print("Entre com o primeiro número: ");
    n1 = scan.nextDouble();

    System.out.print("Entre com o segundo número: ");
    n2 = scan.nextDouble();

    System.out.print("Entre com operador: +, -, *, / : ");
    operador = scan.next();

    switch (operador) {
    case "+":
      System.out.print("A soma de " + n1 + " + " + n2 + " = " + ( n1 + n2));
      break;
    case "-":
      System.out.print("A subtraçao de " + n1 + " - " + n2 + " = " + (n1-n2));
      break;
    case "*":
      System.out.print("A multiplicaçao de " + n1 + " * " + n2 + " = " + (n1*n2));
      break;
    case "/":
      System.out.print("A divisão de " + n1 + "/" + n2 + " = " + (n1/n2));
      break;
    default:
      System.out.print("Operador inválido");
    }
    scan.close();

  }

}
