package logica.programacao.aula03;

import java.util.Scanner;

public class Aula_03_parte_4 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String nome;
    double salarioFixo, totalVendas, salarioFimMes;

    System.out.print("Nome do vendedor: ");
    nome = scan.next();

    System.out.print("Entre com o salário do vendedor: R$ ");
    salarioFixo = scan.nextDouble();

    System.out.print("Total de vendas no mês: R$ ");
    totalVendas = scan.nextDouble();

    salarioFimMes = salarioFixo + (totalVendas * 0.15);
    System.out.println();

    System.out.println("Nome do vendedor: " + nome);
    System.out.println("Salário Fixo: R$ " + salarioFixo);
    System.out.println("Salário do fim do mês: R$ " + salarioFimMes);
    scan.close();
  }
}
