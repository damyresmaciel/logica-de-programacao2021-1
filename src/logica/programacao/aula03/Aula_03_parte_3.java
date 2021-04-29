package logica.programacao.aula03;

import java.util.Scanner;

public class Aula_03_parte_3 {

  public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    
    double km,combustivelUsado, mediaConsumo;
    System.out.print("Qual foi a quantidade de quilometros percorrido? ");
    km = scan.nextDouble();
    
    System.out.print("Quanto de combustivel foi usado? ");
    combustivelUsado = scan.nextDouble();
    
    mediaConsumo =  km / combustivelUsado ;

    System.out.println("O consumo do automovel foi: " + mediaConsumo);
    scan.close();
  }

}
