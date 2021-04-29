package logica.programacao.ap1;

import java.util.Scanner;

public class Questao08 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    
    double n1, n2, media, R$;
    System.out.println("Entre com a primeira nota");
    n1 = scan.nextDouble();
    System.out.println("Entre com a segunda nota");
    n2 = scan.nextDouble();
    if (n2 < 4) {
      System.out.println("Reprovado por regressão");

    } else {
      media = (n1 + n2) / 2;
      System.out.println(media);
      if (media >= 7) {
        System.out.println("Aprovado");
      }
      if (media >= 4 && media < 7) {
        System.out.println("Avaliação final");
      }
      if (media < 4) {
        System.out.println("Reprovado");
      }
    }

  }

}
