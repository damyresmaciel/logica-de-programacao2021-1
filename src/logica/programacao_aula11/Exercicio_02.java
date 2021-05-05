package logica.programacao_aula11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_02 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    List<Double> numeros = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      System.out.print("Entre com a nota: ");
      numeros.add(scan.nextDouble());

    }
    Double soma = 0.0;
    for (Double s : numeros) {
      soma += s;
    }
    Double media = soma / 10;
    System.out.println("A média das notas é : " + media);
    scan.close();
  }


}
