package logica.programacao_aula11;

import java.util.Scanner;

public class Exercicio_01 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int numero [] = new int[10];

    for(int i=0;i<10;i++) {
      System.out.println("Digite um valor: ");
      numero[i] = scan.nextInt();
    }
    for (int i =9; i >= 0; i--) {
      System.out.print(numero[i] + " ");
       

    }
    scan.close();
  }
}
