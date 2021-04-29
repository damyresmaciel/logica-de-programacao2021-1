package logica.programacao.aula03;

import java.util.Scanner;

public class Aula_03_parte_1 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double v1, v2, soma, subtracao, multiplicacao, divisao=0;

    System.out.print("Digite o primeiro valor: ");
    v1 = scan.nextDouble();

    System.out.print("Digite o segundo valor: ");
    v2 = scan.nextDouble();

    soma = v1 + v2;
    subtracao = v1 - v2;
    multiplicacao = v1 * v2;
    
    if(v2!=0) {
      divisao = v1 / v2;
    }
    System.out.println("A soma dos valores é: " + soma);
    System.out.println("A subtração dos valores é: " + subtracao);
    System.out.println("A multiplicação dos valores é: " +  multiplicacao);
    System.out.println("A divisão dos valores é: " + divisao);
    
    scan.close();
  }
}
