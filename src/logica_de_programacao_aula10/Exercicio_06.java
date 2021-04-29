package logica_de_programacao_aula10;

import java.util.Scanner;

public class Exercicio_06 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    double salario;
    int qtdHora, salarioFinal;

    System.out.println("Entre com o sálario: ");
    salario = scan.nextDouble();

    System.out.println("Entre com quantidade de horas: ");
    qtdHora = scan.nextInt();

    if (qtdHora >= 40 && qtdHora <= 60) {
      salario += salario * 0.50;
    }
    if (qtdHora > 60) {
      salario += salario;
    }

    System.out.println(salario);

    scan.close();
  }

}
