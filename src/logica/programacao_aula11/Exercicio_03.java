package logica.programacao_aula11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_03 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    List<Double> temperaturas = new ArrayList<Double>();
    
    for(int i=0; i<4;i++) {
      System.out.println("Entre com a temperatura: ");
      temperaturas.add(scan.nextDouble()) ; 
    }
    Double maior=0d, menor=1000d; 
    for(Double t : temperaturas) {
      if(t>maior) {
        maior=t;
      }
      if(t< menor) {
        menor=t;
      }
    }
    System.out.println(maior);
    System.out.println(menor);
  }

}
