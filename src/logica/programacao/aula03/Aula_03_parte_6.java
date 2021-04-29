package logica.programacao.aula03;

import java.util.Scanner;

public class Aula_03_parte_6 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    double valorParcela, valorEletro;

    System.out.print("Entre com o valor do eletromovel: R$ ");
    valorEletro = scan.nextDouble();

    valorParcela = valorEletro / 5;

    System.out.print("O valor da parcela será em 5x de R$" + valorParcela);
    scan.close();

  }

}
