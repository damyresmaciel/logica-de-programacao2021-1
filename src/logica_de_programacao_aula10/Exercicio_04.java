package logica_de_programacao_aula10;

import java.util.Scanner;

public class Exercicio_04 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int media = 0, contador = 0, numero = 0;

    do {
      System.out.println("Entre com o número: ");
      numero = scan.nextInt();
      contador++;
      media += numero;
    } while (numero != 0);
    
    System.out.println(media);
    
    media = media / (contador-1);
    System.out.println(media);
    scan.close();
  }
}
