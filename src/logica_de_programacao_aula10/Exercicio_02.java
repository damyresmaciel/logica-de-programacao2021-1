package logica_de_programacao_aula10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_02 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int numero, soma = 0;
    List<Integer> numeros = new ArrayList<Integer>();
    do {
      System.out.print("Entre com o número: ");
      numero = scan.nextInt();
      numeros.add(numero);

    } while (numero != -1);
    System.out.println(numeros);
    numeros.remove(numeros.size() - 1);
    System.out.println(numeros);

    for (Integer n : numeros) {
      soma += n;
    }

    System.out.println(soma);
    scan.close();
  }

}
